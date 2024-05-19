
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.zip.Deflater;
import org.apache.commons.compress.archivers.zip.StreamCompressor;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StreamCompressor_ESTest extends StreamCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) filterOutputStream0);
      streamCompressor0.flushDeflater();
      byte[] byteArray0 = new byte[3];
      long long0 = streamCompressor0.write(byteArray0, (byte)1, 1, 15);
      assertEquals(3523407757L, streamCompressor0.getCrc32());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Deflater deflater0 = new Deflater(1);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, deflater0);
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)20, 8192);
      streamCompressor0.deflate(byteArrayInputStream0, (byte)27);
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(20);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) objectOutputStream0);
      byte[] byteArray0 = new byte[9];
      streamCompressor0.writeCounted(byteArray0, 1, (int) (byte)1);
      assertEquals(1L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      streamCompressor0.reset();
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, streamCompressor0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      MockFile mockFile0 = new MockFile("a@rbcW XAqcXwH6P");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      streamCompressor0.deflate();
      assertEquals(2, deflater0.getTotalOut());
      assertEquals(2L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Fe", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      Deflater deflater0 = new Deflater(0, true);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) dataOutputStream0, deflater0);
      streamCompressor0.flushDeflater();
      assertEquals(5, deflater0.getTotalOut());
      assertEquals(5L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) filterOutputStream0);
      byte[] byteArray0 = new byte[3];
      long long0 = streamCompressor0.write(byteArray0, (byte)1, 1, 15);
      assertEquals(3523407757L, streamCompressor0.getCrc32());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[1];
      streamCompressor0.writeCounted(byteArray0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0, deflater0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, 0, 989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0, true);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte)0, 2199);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("/`VW");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0);
      byte[] byteArray0 = new byte[3];
      try { 
        streamCompressor0.writeCounted(byteArray0, 4096, (int) (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, (byte)0, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, 0, (-1363), (-783));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      // Undeclared exception!
      try { 
        streamCompressor0.flushDeflater();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Deflater deflater0 = new Deflater(1);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, deflater0);
      byte[] byteArray0 = new byte[23];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 8192);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(byteArrayInputStream0, (byte)27);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        streamCompressor0.deflate(pipedInputStream0, (-1104));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamCompressor.create(699, (ScatterGatherBackingStore) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(1, (ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, 666, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) null);
      byte[] byteArray0 = new byte[12];
      streamCompressor0.write(byteArray0, (byte)0, (byte)0, 8);
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, streamCompressor0.getCrc32());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      Deflater deflater0 = new Deflater();
      byte[] byteArray0 = new byte[1];
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      streamCompressor0.deflate(byteArrayInputStream0, 0);
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, streamCompressor0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      streamCompressor0.deflate();
      assertEquals(0L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Deflater deflater0 = new Deflater((-1), false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      streamCompressor0.close();
      // Undeclared exception!
      try { 
        streamCompressor0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Deflater has been closed
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Deflater deflater0 = new Deflater((-1), false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Deflater deflater0 = new Deflater(8);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) null, deflater0);
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) filterOutputStream0);
      long long0 = streamCompressor0.getCrc32();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      long long0 = streamCompressor0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Deflater deflater0 = new Deflater(1);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, deflater0);
      byte[] byteArray0 = new byte[23];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)27);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(byteArrayInputStream0, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) filterOutputStream0);
      streamCompressor0.flushDeflater();
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(2, byteArrayOutputStream0.size());
      assertEquals(2L, long0);
  }
}
