
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
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteUtils_ESTest extends ByteUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteUtils.toLittleEndian((DataOutput) null, 0L, (int) (byte) (-22));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ByteUtils.OutputStreamByteConsumer byteUtils_OutputStreamByteConsumer0 = new ByteUtils.OutputStreamByteConsumer(byteArrayOutputStream0);
      ByteUtils.toLittleEndian((ByteUtils.ByteConsumer) byteUtils_OutputStreamByteConsumer0, (long) (byte)0, (int) (byte) (-11));
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ByteUtils.toLittleEndian(byteArray0, (long) (byte) (-81), (int) (byte)0, 1238);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteUtils.toLittleEndian((byte[]) null, (long) 0, (-1168), (-1168));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      long long0 = ByteUtils.fromLittleEndian((InputStream) bufferedInputStream0, (-68));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      long long0 = ByteUtils.fromLittleEndian((DataInput) dataInputStream0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ByteUtils.toLittleEndian((OutputStream) byteArrayOutputStream0, (-444L), 2705);
      assertEquals(2705, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      ByteUtils.toLittleEndian((DataOutput) dataOutputStream0, (-279L), 1168);
      assertEquals(1168, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-123);
      long long0 = ByteUtils.fromLittleEndian(byteArray0, 0, 1);
      assertEquals(133L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      long long0 = ByteUtils.fromLittleEndian(byteArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-23);
      long long0 = ByteUtils.fromLittleEndian(byteArray0);
      assertEquals((-1657324662872342528L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteUtils.ByteSupplier byteUtils_ByteSupplier0 = mock(ByteUtils.ByteSupplier.class, new ViolatedAssumptionAnswer());
      long long0 = ByteUtils.fromLittleEndian(byteUtils_ByteSupplier0, (-921));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteUtils.ByteSupplier byteUtils_ByteSupplier0 = mock(ByteUtils.ByteSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(413, 413, 3068, (-1295), 3068).when(byteUtils_ByteSupplier0).getAsByte();
      long long0 = ByteUtils.fromLittleEndian(byteUtils_ByteSupplier0, 8);
      assertEquals((-4362232419L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.toLittleEndian((ByteUtils.ByteConsumer) null, (-1L), 4014);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ByteUtils.OutputStreamByteConsumer byteUtils_OutputStreamByteConsumer0 = new ByteUtils.OutputStreamByteConsumer(pipedOutputStream0);
      try { 
        ByteUtils.toLittleEndian((ByteUtils.ByteConsumer) byteUtils_OutputStreamByteConsumer0, 0L, 1477);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        ByteUtils.toLittleEndian((DataOutput) dataOutputStream0, (-539L), 8);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((byte[]) null, 8, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian(byteArray0, (-2712), 2783);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't read more than eight bytes into a long value
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't read more than eight bytes into a long value
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((ByteUtils.ByteSupplier) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteUtils.ByteSupplier byteUtils_ByteSupplier0 = mock(ByteUtils.ByteSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian(byteUtils_ByteSupplier0, 2690);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't read more than eight bytes into a long value
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((InputStream) null, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-63), (byte)45);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, bufferedInputStream0);
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((InputStream) sequenceInputStream0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((DataInput) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((DataInput) dataInputStream0, 3627);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't read more than eight bytes into a long value
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      byteArrayInputStream0.read(byteArray0);
      try { 
        ByteUtils.fromLittleEndian((DataInput) dataInputStream0, 1);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      long long0 = ByteUtils.fromLittleEndian(byteArray0, 1149, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.toLittleEndian((OutputStream) null, 0L, 1154);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteUtils.toLittleEndian((OutputStream) null, 255L, (-3422));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.toLittleEndian((DataOutput) null, (long) (byte) (-11), (int) (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zZzioH[rvVVYQ6}aUc/");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteUtils.OutputStreamByteConsumer byteUtils_OutputStreamByteConsumer0 = new ByteUtils.OutputStreamByteConsumer(mockPrintStream0);
      ByteUtils.toLittleEndian((ByteUtils.ByteConsumer) byteUtils_OutputStreamByteConsumer0, (-722L), 906);
      assertEquals(906L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteUtils.toLittleEndian((byte[]) null, 1L, 8, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteUtils.toLittleEndian(byteArray0, 0L, 0, 0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteUtils.fromLittleEndian((InputStream) byteArrayInputStream0, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Premature end of data
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      long long0 = ByteUtils.fromLittleEndian((InputStream) byteArrayInputStream0, 1);
      assertEquals(11, byteArrayInputStream0.available());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = ByteUtils.fromLittleEndian((DataInput) dataInputStream0, 4);
      assertEquals(8, byteArrayInputStream0.available());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ByteUtils.ByteSupplier byteUtils_ByteSupplier0 = mock(ByteUtils.ByteSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(8, 8, 3467, 8, (-1)).when(byteUtils_ByteSupplier0).getAsByte();
      try { 
        ByteUtils.fromLittleEndian(byteUtils_ByteSupplier0, 8);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Premature end of data
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteUtils.ByteSupplier byteUtils_ByteSupplier0 = mock(ByteUtils.ByteSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(8, 3392, 8, 279, 850).when(byteUtils_ByteSupplier0).getAsByte();
      long long0 = ByteUtils.fromLittleEndian(byteUtils_ByteSupplier0, 8);
      assertEquals(6004234344549138440L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian(byteArray0, (-1168), 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1168
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(906);
      // Undeclared exception!
      try { 
        ByteUtils.fromLittleEndian((InputStream) pipedInputStream0, 906);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't read more than eight bytes into a long value
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zZzioH[rvVVYQ6}aUc/");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteUtils.OutputStreamByteConsumer byteUtils_OutputStreamByteConsumer0 = new ByteUtils.OutputStreamByteConsumer(mockPrintStream0);
      byteUtils_OutputStreamByteConsumer0.accept(0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      long long0 = ByteUtils.fromLittleEndian(byteArray0);
      assertEquals(0L, long0);
  }
}
