
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
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      bHSDCodec0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = bHSDCodec0.CHAR3.encode(0, (-2627));
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertTrue(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, (byte)33);
      int int0 = bHSDCodec0.decode((InputStream) bufferedInputStream0, (-1426L));
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals((-1422), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(1, 1, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // b=1 -> h=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      long long0 = bHSDCodec0.smallest();
      assertEquals((-21739L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      int int0 = bHSDCodec0.getS();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int int0 = bHSDCodec0.getL();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-20);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.BYTE1.decode((InputStream) byteArrayInputStream0);
      //  // Unstable assertion: assertEquals(48, bHSDCodec0.lastBandLength);
      //  // Unstable assertion: assertEquals(236, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      try { 
        bHSDCodec0.CHAR3.encode((-2627));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -2627
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.SIGNED5.decodeInts(1234, (InputStream) null, 2996);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        bHSDCodec0.UDELTA5.decodeInts(1676, (InputStream) pushbackInputStream0, (-1500));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.MDELTA5.decodeInts(255, (InputStream) null);
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
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        bHSDCodec0.UNSIGNED5.decodeInts(1, (InputStream) bufferedInputStream0);
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
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) null, 4346097856L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        bHSDCodec0.decode((InputStream) bufferedInputStream0, 256L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
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
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-4355), (byte)76);
      // Undeclared exception!
      try { 
        bHSDCodec0.BCI5.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4355
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PipedInputStream pipedInputStream0 = new PipedInputStream(2147483605);
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
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      String string0 = bHSDCodec0.BCI5.toString();
      assertEquals("(5,4)", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      boolean boolean0 = bHSDCodec0.encodes(245L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      boolean boolean0 = bHSDCodec0.encodes(4346097856L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = bHSDCodec0.BCI5.encode(128, 853);
      assertTrue(bHSDCodec0.isSigned());
      assertArrayEquals(new byte[] {(byte) (-128)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = new int[8];
      byte[] byteArray0 = bHSDCodec0.BRANCH5.encode(intArray0);
      assertFalse(bHSDCodec0.isDelta());
      assertFalse(bHSDCodec0.isSigned());
      assertEquals(8, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int[] intArray0 = new int[8];
      intArray0[0] = (-782);
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(intArray0);
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-37), (byte)21, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)79;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte) (-1));
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals((-41), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.MDELTA5.decode((InputStream) sequenceInputStream0, (long) 2);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (-838L));
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.BYTE1.decode((InputStream) byteArrayInputStream0, (long) (byte)78);
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      String string0 = bHSDCodec0.DELTA5.toString();
      assertEquals("(5,64,1,1)", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      Object object0 = new Object();
      boolean boolean0 = bHSDCodec0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      byte[] byteArray0 = bHSDCodec0.BYTE1.encode(64);
      assertFalse(bHSDCodec0.isDelta());
      assertArrayEquals(new byte[] {(byte)64}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      try { 
        bHSDCodec0.BYTE1.encode((-1003), (-1416));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -1003
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = bHSDCodec0.UDELTA5.encode((int) (byte) (-54), 3);
      assertFalse(bHSDCodec0.isDelta());
      assertArrayEquals(new byte[] {(byte) (-57), (byte) (-4), (byte) (-4), (byte) (-4), (byte) (-4)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(2, (int) (byte)3);
      assertArrayEquals(new byte[] {(byte)4}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = bHSDCodec0.BRANCH5.encode(4);
      assertFalse(bHSDCodec0.isDelta());
      assertFalse(bHSDCodec0.isSigned());
      assertArrayEquals(new byte[] {(byte)5}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      //  // Unstable assertion: assertEquals(19, bHSDCodec0.lastBandLength);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)3;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0);
      //  // Unstable assertion: assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0);
      //  // Unstable assertion: assertEquals(33, bHSDCodec0.lastBandLength);
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-7);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        bHSDCodec0.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.DELTA5.decode((InputStream) sequenceInputStream0);
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
      BHSDCodec bHSDCodec0 = new BHSDCodec(4, 1, 1);
      String string0 = bHSDCodec0.UDELTA5.toString();
      assertEquals((-510L), bHSDCodec0.smallest());
      assertEquals("(5,64,0,1)", string0);
      assertEquals(509L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(1, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // b=1 -> h=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(1, 1, 1950, 128);
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
        bHSDCodec0 = new BHSDCodec(4, 4, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=s<=2
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(5, 304);
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
        bHSDCodec0 = new BHSDCodec(2, (-3799));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(11, 2147483605);
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
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec((-1406), 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 128, 0);
      assertEquals(0L, bHSDCodec0.smallest());
      assertEquals(32895L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2);
      assertEquals(0L, bHSDCodec0.smallest());
      assertEquals(765L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int int0 = bHSDCodec0.getB();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      long long0 = bHSDCodec0.largest();
      assertEquals(4294967293L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      int int0 = bHSDCodec0.getS();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      long long0 = bHSDCodec0.cardinality();
      assertEquals(4346097856L, long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int int0 = bHSDCodec0.getL();
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      int int0 = bHSDCodec0.getH();
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      long long0 = bHSDCodec0.smallest();
      assertEquals(0L, long0);
  }
}
