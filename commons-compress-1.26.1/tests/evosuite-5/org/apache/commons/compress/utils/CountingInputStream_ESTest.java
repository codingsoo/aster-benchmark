
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import org.apache.commons.compress.utils.CountingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CountingInputStream_ESTest extends CountingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-20);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      CountingInputStream countingInputStream0 = new CountingInputStream(sequenceInputStream0);
      int int0 = countingInputStream0.read();
      assertEquals(1L, countingInputStream0.getBytesRead());
      assertEquals(236, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      CountingInputStream countingInputStream0 = new CountingInputStream(sequenceInputStream0);
      countingInputStream0.count(2085L);
      long long0 = countingInputStream0.getBytesRead();
      assertEquals(2085L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2643), (-1));
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.count((byte) (-34));
      long long0 = countingInputStream0.getBytesRead();
      assertEquals((-34L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0, (int) (byte) (-12), (int) (byte) (-12));
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
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      CountingInputStream countingInputStream0 = new CountingInputStream(pushbackInputStream0);
      byte[] byteArray0 = new byte[9];
      try { 
        countingInputStream0.read(byteArray0, (int) (byte) (-20), (int) (byte)57);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-13), 2665);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      CountingInputStream countingInputStream0 = new CountingInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[4];
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-86), (byte)1);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        countingInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      CountingInputStream countingInputStream0 = new CountingInputStream(dataInputStream0);
      byte[] byteArray0 = new byte[5];
      int int0 = countingInputStream0.read(byteArray0, 0, (-3162));
      assertEquals(0L, countingInputStream0.getBytesRead());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      CountingInputStream countingInputStream0 = new CountingInputStream(sequenceInputStream0);
      int int0 = countingInputStream0.read();
      byte[] byteArray1 = new byte[6];
      int int1 = countingInputStream0.read(byteArray1, 0, (-1));
      assertEquals(0L, countingInputStream0.getBytesRead());
      assertTrue(int1 == int0);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0, (-1), (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      CountingInputStream countingInputStream0 = new CountingInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0, (int) (byte)0, (-333));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.read(byteArray0);
      int int0 = countingInputStream0.read(byteArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      CountingInputStream countingInputStream0 = new CountingInputStream(sequenceInputStream0);
      int int0 = countingInputStream0.read();
      assertEquals(1L, countingInputStream0.getBytesRead());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.count((-1));
      assertEquals(0L, countingInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      long long0 = countingInputStream0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      byte[] byteArray0 = new byte[3];
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
