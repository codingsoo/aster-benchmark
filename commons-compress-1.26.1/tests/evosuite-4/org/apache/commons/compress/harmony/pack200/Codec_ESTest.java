
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
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
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
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[3];
      intArray0[1] = 532;
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-4), (byte)70, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      int[] intArray0 = new int[0];
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = bHSDCodec0.encode(532);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int[] intArray0 = bHSDCodec0.decodeInts(0, (InputStream) null, 0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-128);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte)1);
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int int0 = bHSDCodec0.check(0, (InputStream) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      int int0 = bHSDCodec0.check((-930), (InputStream) null);
      assertEquals((-930), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[3];
      intArray0[2] = (-1869);
      try { 
        bHSDCodec0.encode(intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -1869
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
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
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      try { 
        bHSDCodec0.encode((-1821), (-1821));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -1821
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      try { 
        bHSDCodec0.encode((-2723));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -2723
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(10, (InputStream) null, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = new RunCodec(2958, bHSDCodec0, bHSDCodec0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(0, (InputStream) bufferedInputStream0, 1);
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
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        populationCodec0.decodeInts((-1), (InputStream) null, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(5, (InputStream) null);
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
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-924), (-1));
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(0, (InputStream) byteArrayInputStream0);
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
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-892), (InputStream) null);
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
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.decode((InputStream) null, 493L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) null, 1143L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        bHSDCodec0.decode((InputStream) pipedInputStream0, (-1001L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        bHSDCodec0.decode((InputStream) byteArrayInputStream0, 0L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = bHSDCodec0.encode(0, 0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1293, (-1));
      try { 
        bHSDCodec0.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Delta encoding used without passing in last value; this is a coding error
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
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
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        bHSDCodec0.check(2092, pipedInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.decodeInts(20, (InputStream) null, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      int[] intArray0 = bHSDCodec0.decodeInts(0, (InputStream) null);
      assertEquals(0, bHSDCodec0.lastBandLength);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int int0 = bHSDCodec0.check(3, (InputStream) null);
      assertEquals(3, int0);
  }
}
