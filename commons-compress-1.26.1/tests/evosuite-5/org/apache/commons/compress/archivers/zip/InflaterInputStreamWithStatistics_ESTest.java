
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.InflaterInputStreamWithStatistics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InflaterInputStreamWithStatistics_ESTest extends InflaterInputStreamWithStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(bufferedInputStream0);
      byte[] byteArray0 = new byte[6];
      int int0 = inflaterInputStreamWithStatistics0.read(byteArray0, 1, (int) (byte)0);
      assertEquals(0, int0);
      assertEquals(0L, inflaterInputStreamWithStatistics0.getUncompressedCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0, inflater0);
      inflaterInputStreamWithStatistics0.fill();
      long long0 = inflaterInputStreamWithStatistics0.getCompressedCount();
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read((byte[]) null, 0, 344);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(bufferedInputStream0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, (int) (byte) (-1), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(sequenceInputStream0);
      byte[] byteArray0 = new byte[3];
      inflaterInputStreamWithStatistics0.close();
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, 0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Inflater inflater0 = new Inflater(true);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0, inflater0, 856);
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, 0, 1);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Inflater inflater0 = new Inflater(true);
      byte[] byteArray0 = new byte[8];
      inflater0.setInput(byteArray0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0, inflater0);
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // invalid stored block lengths
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Inflater inflater0 = new Inflater(false);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0, inflater0);
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.fill();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Inflater inflater0 = new Inflater(false);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(mockFileInputStream0, inflater0);
      try { 
        inflaterInputStreamWithStatistics0.fill();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte) (-1));
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      try { 
        inflaterInputStreamWithStatistics0.fill();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1626);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pushbackInputStream0, (Inflater) null, 1626);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(sequenceInputStream0, inflater0, (-2537));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // buffer size <= 0
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics((InputStream) null, inflater0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Inflater inflater0 = new Inflater(false);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(mockFileInputStream0, inflater0);
      long long0 = inflaterInputStreamWithStatistics0.getCompressedCount();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(sequenceInputStream0, inflater0);
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0);
      long long0 = inflaterInputStreamWithStatistics0.getUncompressedCount();
      assertEquals(0L, long0);
  }
}
