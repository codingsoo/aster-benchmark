
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BHSDCodec_ESTest extends BHSDCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      bHSDCodec0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      bHSDCodec0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int[] intArray0 = new int[9];
      intArray0[4] = (-881);
      byte[] byteArray0 = bHSDCodec0.MDELTA5.encode(intArray0);
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int[] intArray0 = new int[9];
      intArray0[5] = (-2147483646);
      byte[] byteArray0 = bHSDCodec0.MDELTA5.encode(intArray0);
      assertTrue(bHSDCodec0.isSigned());
      assertEquals(17, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      long long0 = bHSDCodec0.smallest();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int int0 = bHSDCodec0.getS();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int int0 = bHSDCodec0.getL();
      assertEquals(192, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.BRANCH5.decode((InputStream) byteArrayInputStream0, (long) 5);
      assertTrue(bHSDCodec0.isDelta());
      assertEquals(4, int0);
      assertTrue(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      try { 
        bHSDCodec0.BYTE1.encode((-2147483646));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -2147483646
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(2, (InputStream) byteArrayInputStream0, (-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-571), (InputStream) null, 692);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(1470, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        bHSDCodec0.MDELTA5.decodeInts(0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-153), (InputStream) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        bHSDCodec0.DELTA5.decode((InputStream) null, (-1480L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(5, 5);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1424), 3734);
      // Undeclared exception!
      try { 
        bHSDCodec0.BCI5.decode((InputStream) byteArrayInputStream0, (long) (-1424));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1424
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      PipedInputStream pipedInputStream0 = new PipedInputStream(4108);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 4108);
      try { 
        bHSDCodec0.decode((InputStream) pushbackInputStream0, (long) 4108);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.UNSIGNED5.decode((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3331), (byte)69);
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3331
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      PipedInputStream pipedInputStream0 = new PipedInputStream(3688);
      try { 
        bHSDCodec0.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      boolean boolean0 = bHSDCodec0.encodes(256L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int[] intArray0 = new int[3];
      intArray0[2] = 1508;
      try { 
        bHSDCodec0.BYTE1.encode(intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 1508
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = bHSDCodec0.encode((-310), (-944));
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (long) (-310));
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals((-310), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int[] intArray0 = new int[3];
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(intArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.BYTE1.decode((InputStream) byteArrayInputStream0, (long) 256);
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      long long0 = bHSDCodec0.cardinality();
      assertEquals(86956L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      String string0 = bHSDCodec0.UDELTA5.toString();
      assertEquals("(5,64,0,1)", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      String string0 = bHSDCodec0.DELTA5.toString();
      assertEquals("(5,64,1,1)", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      boolean boolean0 = bHSDCodec0.equals(bHSDCodec0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      Object object0 = new Object();
      boolean boolean0 = bHSDCodec0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      boolean boolean0 = bHSDCodec0.encodes(4210816L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int[] intArray0 = new int[9];
      intArray0[5] = (-2147483646);
      intArray0[6] = 5;
      byte[] byteArray0 = bHSDCodec0.MDELTA5.encode(intArray0);
      assertEquals(17, byteArray0.length);
      assertTrue(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int[] intArray0 = bHSDCodec0.DELTA5.decodeInts(0, (InputStream) null, (-1632));
      assertArrayEquals(new int[] {(-1632)}, intArray0);
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.CHAR3.decodeInts(128, (InputStream) null, 1195);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      //  // Unstable assertion: assertEquals(43, bHSDCodec0.lastBandLength);
      
      bHSDCodec0.BRANCH5.decodeInts(0, (InputStream) null);
      //  // Unstable assertion: assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      bHSDCodec0.BRANCH5.decode((InputStream) byteArrayInputStream0, (long) 5);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      try { 
        bHSDCodec0.CHAR3.decode((InputStream) pushbackInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        bHSDCodec0.DELTA5.decode((InputStream) dataInputStream0, (long) 0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-52);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals(204, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(7, byteArrayInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        bHSDCodec0.UDELTA5.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Delta encoding used without passing in last value; this is a coding error
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(3, 256, 0);
      assertEquals(16777215L, bHSDCodec0.largest());
      assertFalse(bHSDCodec0.isDelta());
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(2, 2, 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=d<=1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(5, 255, 256, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=s<=2
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(4, 2140, (-171));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(3, (-1711), (-300), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(256, 256, 256);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec((-1381), (-1381));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(5, 5);
      String string0 = bHSDCodec0.toString();
      assertEquals(0L, bHSDCodec0.smallest());
      assertEquals(199155L, bHSDCodec0.largest());
      assertEquals("(5,5)", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int int0 = bHSDCodec0.getB();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      long long0 = bHSDCodec0.largest();
      assertEquals(4294967293L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int int0 = bHSDCodec0.getS();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2, 2);
      assertEquals(573L, bHSDCodec0.largest());
      assertEquals((-191L), bHSDCodec0.smallest());
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int int0 = bHSDCodec0.getL();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int int0 = bHSDCodec0.getH();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = bHSDCodec0.DELTA5.encode(2);
      assertFalse(bHSDCodec0.isDelta());
      assertFalse(bHSDCodec0.isSigned());
      assertArrayEquals(new byte[] {(byte)4}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      long long0 = bHSDCodec0.smallest();
      assertEquals((-2147483648L), long0);
  }
}
