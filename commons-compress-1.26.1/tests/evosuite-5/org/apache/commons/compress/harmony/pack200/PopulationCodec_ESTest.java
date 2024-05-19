
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PopulationCodec_ESTest extends PopulationCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[3];
      byte[] byteArray0 = populationCodec0.encode(intArray0, intArray1, intArray0);
      assertEquals(10, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        populationCodec0.encode(intArray0, (int[]) null, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = null;
      try {
        populationCodec0 = new PopulationCodec(bHSDCodec0, 0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // L must be between 1..255
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PopulationCodec populationCodec0 = null;
      try {
        populationCodec0 = new PopulationCodec((Codec) null, 256, (Codec) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // L must be between 1..255
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      BHSDCodec bHSDCodec1 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec1);
      assertEquals(0, populationCodec0.lastBandLength);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      BHSDCodec bHSDCodec1 = (BHSDCodec)populationCodec0.getUnfavouredCodec();
      assertEquals(65216L, bHSDCodec1.largest());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      PopulationCodec populationCodec1 = new PopulationCodec(populationCodec0, 5, bHSDCodec0);
      Codec codec0 = populationCodec1.getTokenCodec();
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(2940, bHSDCodec0, bHSDCodec0);
      PopulationCodec populationCodec0 = new PopulationCodec(runCodec0, bHSDCodec0, bHSDCodec0);
      Codec codec0 = populationCodec0.getFavouredCodec();
      assertSame(codec0, runCodec0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(5, 5);
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = new int[7];
      intArray0[4] = (-729);
      try { 
        populationCodec0.encode(intArray0, intArray0, intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,5) does not encode the value -729
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        populationCodec0.encode(intArray0, intArray0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        populationCodec0.decodeInts(0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, 1, bHSDCodec0);
      // Undeclared exception!
      try { 
        populationCodec0.decodeInts(Integer.MAX_VALUE, (InputStream) byteArrayInputStream0);
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
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      // Undeclared exception!
      try { 
        populationCodec0.decodeInts((-48), (InputStream) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        populationCodec0.decode((InputStream) pipedInputStream0, (long) 0);
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
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = null;
      try {
        populationCodec0 = new PopulationCodec(bHSDCodec0, (-1184), bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // L must be between 1..255
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      PopulationCodec populationCodec0 = null;
      try {
        populationCodec0 = new PopulationCodec(bHSDCodec0, 1482, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // L must be between 1..255
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = populationCodec0.getFavoured();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.encode(0, 0);
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
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      Codec codec0 = populationCodec0.getUnfavouredCodec();
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      try { 
        populationCodec0.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      Codec codec0 = populationCodec0.getFavouredCodec();
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      Codec codec0 = populationCodec0.getTokenCodec();
      assertSame(bHSDCodec0, codec0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      PopulationCodec populationCodec1 = new PopulationCodec(populationCodec0, 5, bHSDCodec0);
      try { 
        populationCodec1.decodeInts(633, (InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.encode((-85));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }
}
