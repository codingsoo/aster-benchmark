
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
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
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
      byte[] byteArray0 = new byte[2];
      CRC32 cRC32_0 = new CRC32();
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, (byte) (-103), 1330L);
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (-3479), 3068);
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
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.skip((byte)1);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (byte)1, (byte)51);
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
  public void test02()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte) (-1));
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (-542L), (byte)0);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 9L, (-902L));
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (int) (byte) (-1), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, dataInputStream0, (-2605L), 0L);
      byte[] byteArray0 = new byte[8];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (-3331), (-4119));
      assertEquals((-2605L), checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 9L, (-902L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(7, byteArrayInputStream0.available());
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 2048L, 0L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(2048L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte) (-1));
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (-542L), (byte)0);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals((-542L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, (InputStream) null, (-928L), (-928L));
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte) (-1), (int) (byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CheckedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream((Checksum) null, byteArrayInputStream0, 3789L, 3789L);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (-733), (-188));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, (-128L), (-128L));
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (-1349), (-1349));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream((Checksum) null, (InputStream) null, 1L, 1L);
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
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-126), 2106185885);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 2106185885, 2146758146L);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (byte)1, (byte)51);
      try { 
        checksumVerifyingInputStream0.read();
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
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 9L, (-902L));
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)1);
      assertEquals(7, byteArrayInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream((Checksum) null, byteArrayInputStream0, 3789L, 3789L);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(3789L, checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, 0L, 0L);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 9L, (-902L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(8L, checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, 0L, 0L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(0L, long0);
  }
}
