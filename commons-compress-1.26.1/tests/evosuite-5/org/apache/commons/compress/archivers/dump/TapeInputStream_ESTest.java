
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.dump.TapeInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TapeInputStream_ESTest extends TapeInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 424935705);
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.skip(424935705);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(byteArrayInputStream0);
      int int0 = tapeInputStream0.available();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-593));
      TapeInputStream tapeInputStream0 = new TapeInputStream(byteArrayInputStream0);
      int int0 = tapeInputStream0.available();
      assertEquals((-593), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      try { 
        tapeInputStream0.skip(1024L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Input buffer is closed
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.readRecord();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        tapeInputStream0.read(byteArray0, (int) (byte)16, (-358));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      try { 
        tapeInputStream0.peek();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Input buffer is closed
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        tapeInputStream0.available();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4);
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        tapeInputStream0.read(byteArray0, (int) (byte)0, 48128);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(mockFileInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.skip(1024L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.skip((-468L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(byteArrayInputStream0);
      long long0 = tapeInputStream0.skip((byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      try { 
        tapeInputStream0.resetBlockSize(0, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Block with 0 records found, must be at least 1
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        tapeInputStream0.resetBlockSize(3, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      try { 
        tapeInputStream0.readRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Input buffer is closed
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[4];
      int int0 = tapeInputStream0.read(byteArray0, (-4633), (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        tapeInputStream0.read(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.peek();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File file0 = MockFile.createTempFile("da NOCmt", "Y/Xk<%55y=@/E");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(mockFileInputStream0);
      tapeInputStream0.close();
      try { 
        tapeInputStream0.available();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      tapeInputStream0.close();
      assertEquals(0L, tapeInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("da NOCmt", "Y/Xk<%55y=@/E");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(mockFileInputStream0);
      int int0 = tapeInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      long long0 = tapeInputStream0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.read();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }
}