
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.Enumeration;
import java.util.zip.Deflater;
import org.apache.commons.compress.archivers.zip.StreamCompressor;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StreamCompressor_ESTest extends StreamCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      byte[] byteArray0 = new byte[15];
      streamCompressor0.writeCounted(byteArray0);
      long long0 = streamCompressor0.write(byteArray0, (byte)9, (byte)0, 0);
      assertEquals(15L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("wa\"+vi/92[dk-V");
      byte[] byteArray0 = new byte[6];
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      streamCompressor0.deflate(sequenceInputStream0, (byte) (-117));
      assertEquals(2982322595L, streamCompressor0.getCrc32());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("wa\"+vi/92[dk-V");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      streamCompressor0.deflate(bufferedInputStream0, (byte)11);
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, streamCompressor0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Dx!l}", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) objectOutputStream0, deflater0);
      streamCompressor0.reset();
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, streamCompressor0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      byte[] byteArray0 = new byte[15];
      streamCompressor0.writeCounted(byteArray0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(15L, fileChannel0.size());
      assertEquals(15L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      byte[] byteArray0 = new byte[5];
      streamCompressor0.writeCounted(byteArray0);
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(5L, fileChannel0.size());
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Ei_>QTmE7[z8,xPZm#");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      streamCompressor0.writeCounted(byteArray0, 13, (int) (byte) (-44));
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals((-44L), streamCompressor0.getTotalBytesWritten());
      assertEquals((-44L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "W(%'>F");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater(0, false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte) (-28), (int) (byte) (-115));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      byte[] byteArray0 = new byte[5];
      mockFileOutputStream0.close();
      try { 
        streamCompressor0.writeCounted(byteArray0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("xT", true);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0);
      byte[] byteArray0 = new byte[0];
      try { 
        streamCompressor0.writeCounted(byteArray0);
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
      Deflater deflater0 = new Deflater(0, false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) null, deflater0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, (byte)54, (byte)0, (-2827));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("\"_'o$9%%s~");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0);
      byte[] byteArray0 = new byte[1];
      try { 
        streamCompressor0.write(byteArray0, (byte)0, (byte)0, 963);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) dataOutputStream0, (Deflater) null);
      // Undeclared exception!
      try { 
        streamCompressor0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("f*=qy f");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) dataOutputStream0, (Deflater) null);
      // Undeclared exception!
      try { 
        streamCompressor0.flushDeflater();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = mockFileInputStream0.getChannel();
      Deflater deflater0 = new Deflater(0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0, (Deflater) null);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("TZaJU*r~Nth9~(>`");
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamCompressor.create((-1542), (ScatterGatherBackingStore) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Dx!l}", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) objectOutputStream0, deflater0);
      streamCompressor0.deflate();
      assertEquals(2L, deflater0.getBytesWritten());
      assertEquals(2L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      assertEquals(0L, streamCompressor0.getCrc32());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      byte[] byteArray0 = new byte[5];
      long long0 = streamCompressor0.write(byteArray0, (byte)0, (byte)0, 8);
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Deflater deflater0 = new Deflater(0, true);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) null, deflater0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(sequenceInputStream0, (byte) (-117));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("wa\"+vi/92[dk-V");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      streamCompressor0.flushDeflater();
      assertEquals(2L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("wa\"+vi/92[dk-V");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      streamCompressor0.deflate();
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
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
  public void test26()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("wa\"+vi/92[dk-V");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      streamCompressor0.close();
      assertEquals(0L, streamCompressor0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)48);
      try { 
        streamCompressor0.deflate(pipedInputStream0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("wa\"+vi/92[dk-V");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("wa\"+vi/92[dk-V");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      long long0 = streamCompressor0.getCrc32();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      long long0 = streamCompressor0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = mockFileInputStream0.getChannel();
      Deflater deflater0 = new Deflater(0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0);
      try { 
        streamCompressor0.flushDeflater();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) dataOutputStream0, (Deflater) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, 1, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }
}
