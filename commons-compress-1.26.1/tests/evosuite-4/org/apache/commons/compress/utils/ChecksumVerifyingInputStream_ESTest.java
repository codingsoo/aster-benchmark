
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import org.apache.commons.compress.utils.ChecksumVerifyingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChecksumVerifyingInputStream_ESTest extends ChecksumVerifyingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<ChecksumVerifyingInputStream> enumeration0 = (Enumeration<ChecksumVerifyingInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, (-2057L), 4028L);
      byte[] byteArray0 = new byte[5];
      try { 
        checksumVerifyingInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, bufferedInputStream0, 0L, (-1379L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(0L, checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, 1195L, 1195L);
      byte[] byteArray0 = new byte[1];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      Enumeration<ChecksumVerifyingInputStream> enumeration0 = (Enumeration<ChecksumVerifyingInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 1549L, 1549L);
      byte[] byteArray0 = new byte[5];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, 0, (int) (byte)4);
      assertEquals((-1), int0);
      assertEquals(1549L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)95;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (byte)95, (byte)95);
      checksumVerifyingInputStream0.read();
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals(95, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, bufferedInputStream0, 0L, (-1379L));
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (byte)95, (byte)95);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(95L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[4];
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, (InputStream) null, 0L, 0L);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte)0, (int) (byte) (-47));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CheckedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (byte)95, (byte)95);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, 0, (int) (byte) (-50));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, (-984L), 1638L);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (-2601), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, mockFileInputStream0, (-1469L), (-247L));
      byte[] byteArray0 = new byte[5];
      try { 
        checksumVerifyingInputStream0.read(byteArray0, 0, (int) (byte)112);
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
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream((Checksum) null, sequenceInputStream0, (byte)117, 1L);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CheckedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      PipedInputStream pipedInputStream0 = new PipedInputStream(776);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, pipedInputStream0, 776, 776);
      try { 
        checksumVerifyingInputStream0.read();
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
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (byte)0, 367L);
      try { 
        checksumVerifyingInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<ChecksumVerifyingInputStream> enumeration0 = (Enumeration<ChecksumVerifyingInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream((Checksum) null, sequenceInputStream0, 1978L, 1978L);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
      assertEquals(1978L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, mockFileInputStream0, (-1469L), (-247L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1469L), checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, (-984L), 1638L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals((-984L), long0);
  }
}
