
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RunCodec_ESTest extends RunCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1601), (byte) (-47));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      pushbackInputStream0.unread(1);
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      RunCodec runCodec0 = new RunCodec(2107, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.decode((InputStream) pushbackInputStream0, (long) 0);
      assertEquals(2106, runCodec0.getK());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1601), (byte) (-47));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      pushbackInputStream0.unread(1);
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(2107, bHSDCodec0, bHSDCodec0);
      runCodec0.decode((InputStream) pushbackInputStream0, (long) 0);
      try { 
        runCodec0.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec((-1), bHSDCodec0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a RunCodec for a negative number of numbers
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      RunCodec runCodec0 = new RunCodec(228, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(6, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1602, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      try { 
        runCodec0.decode((InputStream) sequenceInputStream0, 1089L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(128, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2, 0);
      try { 
        runCodec0.decode((InputStream) byteArrayInputStream0, (-2147483648L));
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1602, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1601), (byte)1);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(2107, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) bufferedInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        runCodec0.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1601), (byte) (-47));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      pushbackInputStream0.unread(1);
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.decode((InputStream) pushbackInputStream0, (long) 0);
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1601), (byte) (-47));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      pushbackInputStream0.unread(1);
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1294, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.decode((InputStream) pushbackInputStream0);
      assertEquals(1293, runCodec0.getK());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(477, bHSDCodec0, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Must supply both codecs for a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(1596, (Codec) null, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Must supply both codecs for a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(0, bHSDCodec0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a RunCodec for a negative number of numbers
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(128, bHSDCodec0, bHSDCodec0);
      runCodec0.getBCodec();
      assertEquals(128, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(513, bHSDCodec0, bHSDCodec0);
      String string0 = runCodec0.toString();
      assertEquals("RunCodec[k=513;aCodec=(5,4)bCodec=(5,4)]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(513, bHSDCodec0, bHSDCodec0);
      runCodec0.getACodec();
      assertEquals(513, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(513, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.getK();
      assertEquals(513, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      RunCodec runCodec0 = new RunCodec(40, populationCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-15), 3);
      try { 
        runCodec0.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1602, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(1708, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      RunCodec runCodec0 = new RunCodec(44, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(1379, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }
}
