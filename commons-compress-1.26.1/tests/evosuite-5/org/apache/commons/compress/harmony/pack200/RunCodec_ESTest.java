
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
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RunCodec_ESTest extends RunCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      int int0 = runCodec0.decode((InputStream) dataInputStream0, (-1L));
      assertEquals(1, runCodec0.getK());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      runCodec0.decode((InputStream) dataInputStream0, (-1L));
      runCodec0.decode((InputStream) pushbackInputStream0);
      runCodec0.decode((InputStream) pushbackInputStream0, (long) 2);
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte)0);
      assertEquals((-2), runCodec0.getK());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = new RunCodec(37, bHSDCodec0, bHSDCodec0);
      runCodec0.lastBandLength = 5305;
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
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      BHSDCodec bHSDCodec1 = Codec.BRANCH5;
      RunCodec runCodec0 = new RunCodec(953, bHSDCodec0, bHSDCodec1);
      assertEquals(953, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec((-2898), bHSDCodec0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a RunCodec for a negative number of numbers
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      runCodec0.decode((InputStream) dataInputStream0, (-1L));
      runCodec0.decode((InputStream) pushbackInputStream0);
      int int0 = runCodec0.getK();
      //  // Unstable assertion: assertEquals(130, bHSDCodec0.lastBandLength);
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      runCodec0.decode((InputStream) dataInputStream0, (-1L));
      runCodec0.decode((InputStream) dataInputStream0, (long) (byte)0);
      runCodec0.decode((InputStream) pushbackInputStream0);
      int int0 = runCodec0.getK();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-34);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      int int0 = runCodec0.decode((InputStream) dataInputStream0, (-1L));
      assertEquals(1, runCodec0.getK());
      assertEquals(111, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)41;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      runCodec0.decode((InputStream) dataInputStream0, (-1L));
      int int0 = runCodec0.decode((InputStream) pushbackInputStream0);
      assertEquals(0, runCodec0.getK());
      assertEquals(41, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)41;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      runCodec0.decode((InputStream) dataInputStream0, (-1L));
      int int0 = runCodec0.decode((InputStream) pushbackInputStream0);
      assertEquals(0, runCodec0.getK());
      assertEquals((-21), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(256, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(1026, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) null, (long) 1);
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
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = new RunCodec(37, bHSDCodec0, bHSDCodec0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(2816);
      try { 
        runCodec0.decode((InputStream) pipedInputStream0, (long) 37);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(39, bHSDCodec0, bHSDCodec0);
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        runCodec0.decode((InputStream) sequenceInputStream0, (long) 5);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      RunCodec runCodec0 = new RunCodec(1206, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-2), (byte) (-102));
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
  public void test15()  throws Throwable  {
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(6, (Codec) null, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Must supply both codecs for a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
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
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      runCodec0.getBCodec();
      assertEquals(2, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = new RunCodec(37, bHSDCodec0, bHSDCodec0);
      String string0 = runCodec0.toString();
      assertEquals("RunCodec[k=37;aCodec=(1,256)bCodec=(1,256)]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      RunCodec runCodec0 = new RunCodec(1206, bHSDCodec0, bHSDCodec0);
      runCodec0.getACodec();
      assertEquals(1206, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.getK();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(3735, (InputStream) dataInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(2861, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(5, 37);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }
}
