
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


package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BZip2CompressorOutputStream_ESTest extends BZip2CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(0L);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = null;
      try {
        bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data((-137));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(";*&gd%a1'", true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 2);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("]SWBm#", "]SWBm#");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.finish();
      try { 
        bZip2CompressorOutputStream0.write((-892));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(objectOutputStream0, 1);
      byte[] byteArray0 = new byte[4];
      bZip2CompressorOutputStream0.finish();
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 1, (int) (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 2);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 360, 3451);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(360) + len(3451) > buf.length(0).
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(";*&gd%a1'", true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 2);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 254, (int) (byte) (-48));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // len(-48) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(objectOutputStream0, 1);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (-2280), (int) (byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(-2280) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 2);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)69;
      byteArray0[1] = (byte) (-11);
      byteArray0[2] = (byte) (-20);
      byteArray0[3] = (byte)20;
      byteArray0[5] = (byte)13;
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.write(2);
      bZip2CompressorOutputStream0.finish();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(objectOutputStream0, 1);
      byte[] byteArray0 = new byte[4];
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.finish();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 2);
      byte[] byteArray0 = new byte[27];
      byteArray0[0] = (byte)69;
      byteArray0[4] = (byte)13;
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.finish();
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(objectOutputStream0, 1);
      bZip2CompressorOutputStream0.flush();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(";*&gd%a1'", true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 2);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.flush();
      assertEquals(2, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(";*&gd%a1'", true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 2);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.finish();
      assertEquals(2, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1621);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(1621) > 9
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(0) < 1
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 2);
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-11);
      byteArray0[2] = (byte) (-20);
      byteArray0[3] = (byte) (-11);
      byteArray0[4] = (byte)13;
      byteArray0[5] = (byte)20;
      byteArray0[6] = (byte) (-49);
      byteArray0[7] = (byte) (-62);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.finish();
      assertEquals(2, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(1034L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize((-1L));
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(objectOutputStream0, 1);
      int int0 = bZip2CompressorOutputStream0.getBlockSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(objectOutputStream0, 1);
      bZip2CompressorOutputStream0.finish();
      bZip2CompressorOutputStream0.close();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }
}
