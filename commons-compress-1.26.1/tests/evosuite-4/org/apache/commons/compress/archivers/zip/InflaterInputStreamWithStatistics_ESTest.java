
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InflaterInputStreamWithStatistics_ESTest extends InflaterInputStreamWithStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1094);
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0, inflater0, 1094);
      byte[] byteArray0 = new byte[4];
      int int0 = inflaterInputStreamWithStatistics0.read(byteArray0, (int) (byte)1, (int) (byte)0);
      assertEquals(0L, inflaterInputStreamWithStatistics0.getUncompressedCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      inflaterInputStreamWithStatistics0.fill();
      long long0 = inflaterInputStreamWithStatistics0.getCompressedCount();
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, (int) (byte)0, 1);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // unknown compression method
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read((byte[]) null, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1157), (-3433));
      Inflater inflater0 = new Inflater(false);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0, inflater0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, 1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1094);
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0, inflater0, 1094);
      byte[] byteArray0 = new byte[4];
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, 0, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0, inflater0, 1);
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, (int) (byte)0, 1);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // unknown compression method
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 596);
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pushbackInputStream0, inflater0, 596);
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
  public void test10()  throws Throwable  {
      Enumeration<InflaterInputStreamWithStatistics> enumeration0 = (Enumeration<InflaterInputStreamWithStatistics>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 660);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(bufferedInputStream0);
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
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0, inflater0, (byte)1);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics1 = new InflaterInputStreamWithStatistics(inflaterInputStreamWithStatistics0);
      try { 
        inflaterInputStreamWithStatistics1.fill();
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // invalid stored block lengths
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(bufferedInputStream0, inflater0);
      try { 
        inflaterInputStreamWithStatistics0.fill();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enumeration<InflaterInputStreamWithStatistics> enumeration0 = (Enumeration<InflaterInputStreamWithStatistics>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(sequenceInputStream0);
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
  public void test14()  throws Throwable  {
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics((InputStream) null, inflater0, 835);
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
      Enumeration<InflaterInputStreamWithStatistics> enumeration0 = (Enumeration<InflaterInputStreamWithStatistics>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(sequenceInputStream0, inflater0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // buffer size <= 0
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Inflater inflater0 = new Inflater(true);
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-59), 1935);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      long long0 = inflaterInputStreamWithStatistics0.getCompressedCount();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-59), 1935);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0);
      long long0 = inflaterInputStreamWithStatistics0.getUncompressedCount();
      assertEquals(0L, long0);
  }
}
