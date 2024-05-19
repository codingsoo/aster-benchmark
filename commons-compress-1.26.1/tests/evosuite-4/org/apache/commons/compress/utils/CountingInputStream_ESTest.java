
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
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.utils.CountingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CountingInputStream_ESTest extends CountingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      CountingInputStream countingInputStream0 = new CountingInputStream(mockFileInputStream0);
      byte[] byteArray0 = new byte[7];
      int int0 = countingInputStream0.read(byteArray0, (int) (byte) (-110), (int) (byte) (-1));
      assertEquals(0L, countingInputStream0.getBytesRead());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-88);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read();
      assertEquals(1L, countingInputStream0.getBytesRead());
      assertEquals(168, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      countingInputStream0.count((-456L));
      long long0 = countingInputStream0.getBytesRead();
      assertEquals((-456L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0, (-4431), (-4431));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      CountingInputStream countingInputStream0 = new CountingInputStream(mockFileInputStream0);
      byte[] byteArray0 = new byte[9];
      try { 
        countingInputStream0.read(byteArray0, 0, (int) (byte)19);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      CountingInputStream countingInputStream0 = new CountingInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[5];
      try { 
        countingInputStream0.read(byteArray0);
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
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        countingInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-96), 3642);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        countingInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -96
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      CountingInputStream countingInputStream0 = new CountingInputStream(pipedInputStream0);
      try { 
        countingInputStream0.read();
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
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0, 1, 1);
      assertEquals(8, byteArrayInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      CountingInputStream countingInputStream0 = new CountingInputStream(sequenceInputStream0);
      byte[] byteArray0 = new byte[2];
      int int0 = countingInputStream0.read(byteArray0, (-1), (-115));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 260, 260);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0, (-1), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0, (-1376), (int) (byte) (-63));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.read(byteArray0);
      int int0 = countingInputStream0.read(byteArray0);
      assertEquals(5L, countingInputStream0.getBytesRead());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 260, 260);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 260, 260);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read();
      assertEquals((-1), int0);
      assertEquals(0L, countingInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.read();
      long long0 = countingInputStream0.getBytesRead();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 260, 260);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.count((-1));
      assertEquals(0L, countingInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      long long0 = countingInputStream0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingInputStream", e);
      }
  }
}
