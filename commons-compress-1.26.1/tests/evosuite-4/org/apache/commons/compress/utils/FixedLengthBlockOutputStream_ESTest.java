
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
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
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
      MockFile mockFile0 = new MockFile("u2]r*)P", "`V+34^g+7%ZDk!\r");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, (byte)2);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)40);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(40, byteBuffer0.position());
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 1);
      byte[] byteArray0 = new byte[8];
      fixedLengthBlockOutputStream0.write(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 568);
      fixedLengthBlockOutputStream0.write((-1));
      try { 
        fixedLengthBlockOutputStream0.flushBlock();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel0, 0);
      byte[] byteArray0 = new byte[9];
      fixedLengthBlockOutputStream0.write(byteArray0, (-2850), (int) (byte) (-1));
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 11);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mF1cm=3?H5Wy2C]");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteArray0, 0, 2396);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 1);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)0, 460);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(objectOutputStream0, 0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, 909, 909);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, 1);
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 0);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test10()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)1);
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
  public void test11()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, 1);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(1);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 7);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 1350);
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
  public void test15()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, 2);
      fixedLengthBlockOutputStream0.write(2);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.flushBlock();
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 0);
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
  public void test17()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, (-2052));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative capacity: -2052
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(objectOutputStream0, 0);
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 2, 0);
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 0);
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, 1);
      fixedLengthBlockOutputStream0.close();
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertFalse(socketChannel0.isOpen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 586);
      fixedLengthBlockOutputStream0.flushBlock();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("~bk66InA[(");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 2089);
      fixedLengthBlockOutputStream0.write((int) (byte)0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2089);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(2089, byteBuffer0.position());
      assertEquals(2089, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1439);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 1439);
      fixedLengthBlockOutputStream0.close();
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(595);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 595);
      byte[] byteArray0 = new byte[4];
      fixedLengthBlockOutputStream0.write(byteArray0);
      fixedLengthBlockOutputStream0.write(byteArray0);
      fixedLengthBlockOutputStream0.flushBlock();
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(595, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 11);
      byte[] byteArray0 = new byte[3];
      fixedLengthBlockOutputStream0.write(byteArray0);
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
  public void test27()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1439);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 1439);
      fixedLengthBlockOutputStream0.close();
      fixedLengthBlockOutputStream0.close();
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mF1cm=3?H5Wy2C]");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 0);
      fixedLengthBlockOutputStream0.close();
      byte[] byteArray0 = new byte[0];
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, 0, 2396);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 0);
      byte[] byteArray0 = new byte[4];
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream1 = new FixedLengthBlockOutputStream((WritableByteChannel) fixedLengthBlockOutputStream0, 0);
      try { 
        fixedLengthBlockOutputStream1.write(byteArray0, (int) (byte)1, (int) (byte)1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Direct buffer somehow written to BufferAtATimeOutputChannel
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 586);
      fixedLengthBlockOutputStream0.close();
      try { 
        fixedLengthBlockOutputStream0.write(586);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 3957);
      fixedLengthBlockOutputStream0.write(3957);
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
