
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
import java.io.IOException;
import java.io.InputStream;
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
public class PopulationCodec_ESTest extends PopulationCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = new int[7];
      int[] intArray1 = new int[6];
      byte[] byteArray0 = populationCodec0.encode(intArray1, intArray0, intArray1);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = new int[7];
      int[] intArray1 = new int[6];
      byte[] byteArray0 = populationCodec0.encode(intArray1, intArray0, intArray0);
      assertEquals(21, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      RunCodec runCodec0 = new RunCodec(541, populationCodec0, bHSDCodec0);
      PopulationCodec populationCodec1 = new PopulationCodec(runCodec0, 3, populationCodec0);
      assertEquals(0, populationCodec1.lastBandLength);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PopulationCodec populationCodec0 = null;
      try {
        populationCodec0 = new PopulationCodec((Codec) null, (-1147), (Codec) null);
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
      PopulationCodec populationCodec0 = null;
      try {
        populationCodec0 = new PopulationCodec(bHSDCodec0, 256, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // L must be between 1..255
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      BHSDCodec bHSDCodec1 = Codec.MDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec1, bHSDCodec1);
      assertEquals(0, populationCodec0.lastBandLength);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      Codec codec0 = populationCodec0.getUnfavouredCodec();
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      Codec codec0 = populationCodec0.getFavouredCodec();
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      BHSDCodec bHSDCodec1 = Codec.BCI5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec1);
      int[] intArray0 = new int[6];
      intArray0[4] = (-1389);
      try { 
        populationCodec0.encode(intArray0, intArray0, intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -1389
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        populationCodec0.encode(intArray0, intArray0, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
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
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        populationCodec0.decodeInts(530, (InputStream) null);
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
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        populationCodec0.decodeInts(0, (InputStream) pipedInputStream0);
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
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      PopulationCodec populationCodec0 = null;
      try {
        populationCodec0 = new PopulationCodec(bHSDCodec0, 530, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // L must be between 1..255
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = populationCodec0.getFavoured();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.encode((int) (byte) (-124), (-2113));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      BHSDCodec bHSDCodec1 = (BHSDCodec)populationCodec0.getUnfavouredCodec();
      assertEquals(4, bHSDCodec1.getH());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        populationCodec0.decode((InputStream) sequenceInputStream0);
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
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      BHSDCodec bHSDCodec1 = (BHSDCodec)populationCodec0.getFavouredCodec();
      assertEquals((-2147483648L), bHSDCodec1.smallest());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      try { 
        populationCodec0.decode((InputStream) null, (long) 0);
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
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      Codec codec0 = populationCodec0.getTokenCodec();
      assertEquals(0, codec0.lastBandLength);
  }
}
