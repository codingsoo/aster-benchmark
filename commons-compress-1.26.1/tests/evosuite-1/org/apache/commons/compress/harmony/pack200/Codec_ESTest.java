
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Codec_ESTest extends Codec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int[] intArray0 = new int[2];
      intArray0[0] = (-687);
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte)92, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[8];
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      int[] intArray0 = new int[0];
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = populationCodec0.UDELTA5.encode(1415, 0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = bHSDCodec0.encode(0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.check(0, (InputStream) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(2, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.check(2, (InputStream) null);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int int0 = bHSDCodec0.check((-1934), (InputStream) null);
      assertEquals((-1934), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[5];
      intArray0[0] = (-212);
      try { 
        bHSDCodec0.encode(intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -212
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        bHSDCodec0.encode((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      RunCodec runCodec0 = new RunCodec(3, bHSDCodec0, bHSDCodec0);
      Codec codec0 = runCodec0.getBCodec();
      try { 
        codec0.encode((-464), (-464));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -464
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.decodeInts(259, (InputStream) null, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-2378), (InputStream) byteArrayInputStream0, (int) (byte)0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(Integer.MAX_VALUE, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts((-495), (InputStream) pipedInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-2925), (InputStream) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) null, 3000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      try { 
        bHSDCodec0.decode((InputStream) dataInputStream0, (long) 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.decode((InputStream) sequenceInputStream0, 1371L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.decode((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Delta encoding used without passing in last value; this is a coding error
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      RunCodec runCodec0 = new RunCodec(955, bHSDCodec0, bHSDCodec0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 279, 279);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0, 1915);
      try { 
        runCodec0.decode((InputStream) pushbackInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        bHSDCodec0.check(0, byteArrayInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(229, (InputStream) null, 229);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        populationCodec0.BRANCH5.decodeInts(252, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = bHSDCodec0.decodeInts(0, (InputStream) null);
      assertEquals(0, intArray0.length);
      assertEquals(0, bHSDCodec0.lastBandLength);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = populationCodec0.decodeInts(0, (InputStream) null, 0);
      byte[] byteArray0 = populationCodec0.encode(intArray0, intArray0, intArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(942, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(2646);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }
}
