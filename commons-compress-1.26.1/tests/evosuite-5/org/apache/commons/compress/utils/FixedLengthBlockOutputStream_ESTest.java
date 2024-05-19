
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.WritableByteChannel;
import org.apache.commons.compress.utils.FixedLengthBlockOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FixedLengthBlockOutputStream_ESTest extends FixedLengthBlockOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("6", true);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 1);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(943);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals("java.nio.DirectByteBuffer[pos=943 lim=943 cap=943]", byteBuffer0.toString());
      assertEquals(943, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 120);
      fixedLengthBlockOutputStream0.write(2787);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      DatagramChannel datagramChannel1 = datagramChannel0.disconnect();
      int int0 = 0;
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel1, int0);
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-73);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)1;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      fixedLengthBlockOutputStream0.flush();
      byteArray0[4] = byte4;
      int int1 = (-1);
      fixedLengthBlockOutputStream0.write(byteArray0, int1, (int) byteArray0[0]);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 887);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, 0, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 0);
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 2);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.isOpen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 108);
      fixedLengthBlockOutputStream0.write(2787);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.flushBlock();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, (-3416));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative capacity: -3416
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 0);
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 338);
      fixedLengthBlockOutputStream0.close();
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertFalse(boolean0);
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("y^-!>z", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 0);
      fixedLengthBlockOutputStream0.flushBlock();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 5615);
      fixedLengthBlockOutputStream0.close();
      try { 
        fixedLengthBlockOutputStream0.write(1447);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to write %,d bytes atomically. Only wrote  %,d");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 6);
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=8 cap=8]", byteBuffer0.toString());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 108);
      fixedLengthBlockOutputStream0.write(2787);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1368);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 338);
      fixedLengthBlockOutputStream0.close();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(7);
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 108);
      byte[] byteArray0 = new byte[16];
      fixedLengthBlockOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream1 = new FixedLengthBlockOutputStream((WritableByteChannel) fixedLengthBlockOutputStream0, 8);
      fixedLengthBlockOutputStream1.write(8);
      try { 
        fixedLengthBlockOutputStream1.flushBlock();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Direct buffer somehow written to BufferAtATimeOutputChannel
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("6");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 1);
      byte[] byteArray0 = new byte[23];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, 1, (int) (byte)125);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("y^-!>z", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 0);
      fixedLengthBlockOutputStream0.close();
      fixedLengthBlockOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("JvRdSWmFI");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, (-1311));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative capacity: -1311
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 800);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(800);
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Direct buffer somehow written to BufferAtATimeOutputChannel
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 5615);
      fixedLengthBlockOutputStream0.close();
      byte[] byteArray0 = new byte[9];
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 5615);
      byte[] byteArray0 = new byte[9];
      fixedLengthBlockOutputStream0.write(byteArray0);
      try { 
        fixedLengthBlockOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
}
