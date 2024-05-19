
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
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BZip2CompressorOutputStream_ESTest extends BZip2CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)47;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.finish();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(0L);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      File file0 = MockFile.createTempFile("VD9sP{l", "t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      mockFileOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      mockFileOutputStream0.close();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)4;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)4, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)91;
      byteArray0[1] = (byte)91;
      File file0 = MockFile.createTempFile("VD9sP{l", "t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write((int) (byte)91);
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("CJA|Q,I`GvKBcA_", "CJA|Q,I`GvKBcA_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.finish();
      try { 
        bZip2CompressorOutputStream0.write((-373));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      File file0 = MockFile.createTempFile("VD9sP{l", "t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte)4, (int) (byte)91);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(4) + len(91) > buf.length(4).
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      File file0 = MockFile.createTempFile("VD9sP{l", "t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 326, (-2596));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // len(-2596) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (-2), (int) (byte)4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(-2) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)91;
      byteArray0[3] = (byte)4;
      File file0 = MockFile.createTempFile("VD9sP{l", "t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.close();
      assertEquals(40L, file0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)91;
      byteArray0[2] = (byte)4;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write((int) (byte)4);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.write((-373));
      bZip2CompressorOutputStream0.close();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.finish();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write((int) (byte)0);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.write((-373));
      bZip2CompressorOutputStream0.close();
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)91;
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)4;
      File file0 = MockFile.createTempFile("VD9sP{l", "t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.write((int) (byte)4);
      bZip2CompressorOutputStream0.write(23);
      bZip2CompressorOutputStream0.close();
      assertEquals(45L, file0.length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("VD9sP{l", "t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.flush();
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.finish();
      bZip2CompressorOutputStream0.flush();
      assertEquals(4, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.finish();
      assertEquals(4, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("CJA|QI`GvKBcA_", "CJA|QI`GvKBcA_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      mockFileOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("jq&");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1948);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(1948) > 9
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte) (-16));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(-16) < 1
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize((byte)91);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize((-257L));
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      int int0 = bZip2CompressorOutputStream0.getBlockSize();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CJA|Q,I`GvKBcA_");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, (byte)4);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.close();
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }
}
