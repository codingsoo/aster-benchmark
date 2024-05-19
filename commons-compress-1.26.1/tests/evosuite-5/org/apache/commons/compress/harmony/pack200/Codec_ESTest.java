
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Codec_ESTest extends Codec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int[] intArray0 = new int[9];
      intArray0[0] = 1209;
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertArrayEquals(new byte[] {(byte) (-7), (byte)15, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(10, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int[] intArray0 = new int[0];
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = bHSDCodec0.encode((-590), 0);
      assertArrayEquals(new byte[] {(byte) (-14), (byte) (-13), (byte) (-4), (byte) (-4), (byte) (-4)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = bHSDCodec0.encode((-256));
      assertArrayEquals(new byte[] {(byte) (-1), (byte)4}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      int[] intArray0 = bHSDCodec0.decodeInts(0, (InputStream) null, 20);
      assertEquals(1, intArray0.length);
      assertArrayEquals(new int[] {20}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)3;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, 4L);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(401, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.check(0, (InputStream) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int int0 = bHSDCodec0.check((-1), (InputStream) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = new int[9];
      try { 
        populationCodec0.encode(intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        bHSDCodec0.encode((-23), (-23));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -23
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.encode(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        populationCodec0.decodeInts((-1), (InputStream) byteArrayInputStream0, (-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-1762), (InputStream) sequenceInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      try { 
        populationCodec0.decode((InputStream) null, 0L);
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
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) null, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 1396);
      try { 
        bHSDCodec0.decode((InputStream) pushbackInputStream0, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      try { 
        bHSDCodec0.decode((InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Delta encoding used without passing in last value; this is a coding error
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
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
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.decode((InputStream) sequenceInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 4);
      // Undeclared exception!
      try { 
        bHSDCodec0.check(4, bufferedInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(401, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(179, (InputStream) null, 2012);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(401, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(0, (InputStream) null);
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
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(401, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = runCodec0.DELTA5.decodeInts(0, (InputStream) null);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int int0 = populationCodec0.check(3, (InputStream) null);
      assertEquals(3, int0);
  }
}
