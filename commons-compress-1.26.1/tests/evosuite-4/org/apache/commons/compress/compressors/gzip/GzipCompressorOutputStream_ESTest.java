
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


package org.apache.commons.compress.compressors.gzip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GzipCompressorOutputStream_ESTest extends GzipCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setModificationTime((-5L));
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("jCXC]gZ=e");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      gzipCompressorOutputStream0.write(byteArray0, (int) (byte) (-7), (int) (byte) (-29));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1920);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      byte[] byteArray0 = new byte[2];
      gzipCompressorOutputStream0.write(byteArray0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      gzipCompressorOutputStream0.flush();
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".svgz", ".svgz");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write((byte[]) null, 9, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("fQ,FDS4wGQ");
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0, gzipParameters0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write(byteArray0, 0, 1144);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", "org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      byte[] byteArray0 = new byte[8];
      gzipCompressorOutputStream0.finish();
      try { 
        gzipCompressorOutputStream0.write(byteArray0, 0, (int) (byte) (-96));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("$kF#l;B':ua44]}A@?|");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Cannot write more data, the end of the compressed data stream has been reached", true);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0);
      gzipCompressorOutputStream0.finish();
      try { 
        gzipCompressorOutputStream0.write(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      mockFileOutputStream0.close();
      try { 
        gzipCompressorOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      mockFileOutputStream0.close();
      try { 
        gzipCompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream((OutputStream) null, gzipParameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Cannot write more data, the end of the compressed data stream has been reached", true);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setDeflateStrategy((-215));
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream(pipedOutputStream0, gzipParameters0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      byteArrayOutputStream0.writeTo(gzipCompressorOutputStream0);
      assertEquals(10, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(172);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.close();
      try { 
        byteArrayOutputStream0.writeTo(gzipCompressorOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel(1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel((byte)9);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0002\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setComment("Cannot write more data, the end of the compressed data stream has been reached");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      assertEquals(89, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0010\u0000\u0000\u0000\u0000\u0000\uFFFDCannot write more data, the end of the compressed data stream has been reached\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[0];
      gzipCompressorOutputStream0.write(byteArray0, 0, 0);
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      byte[] byteArray0 = new byte[5];
      gzipCompressorOutputStream0.close();
      try { 
        gzipCompressorOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setFileName("c$p^NB(");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      assertEquals(18, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\b\u0000\u0000\u0000\u0000\u0000\uFFFDc$p^NB(\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      gzipCompressorOutputStream0.close();
      gzipCompressorOutputStream0.finish();
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.close();
      gzipCompressorOutputStream0.close();
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1920);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.write(0);
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
      assertEquals(10, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1920);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }
}
