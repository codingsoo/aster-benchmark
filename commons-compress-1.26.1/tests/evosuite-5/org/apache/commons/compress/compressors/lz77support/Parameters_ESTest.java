
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


package org.apache.commons.compress.compressors.lz77support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Parameters_ESTest extends Parameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      parameters_Builder0.withMinBackReferenceLength(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMinBackReferenceLength();
      assertEquals(1024, parameters0.getMaxBackReferenceLength());
      assertEquals(1024, parameters0.getMaxLiteralLength());
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(1024, parameters0.getLazyMatchingThreshold());
      assertEquals(1024, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(1024, parameters0.getNiceBackReferenceLength());
      assertEquals(1024, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      parameters_Builder0.withMaxLiteralLength(10);
      Parameters parameters0 = parameters_Builder0.build();
      assertEquals(10, parameters0.getMaxLiteralLength());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(15, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxCandidates());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMinBackReferenceLength(0);
      assertSame(parameters_Builder0, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMinBackReferenceLength(256);
      Parameters.Builder parameters_Builder2 = parameters_Builder0.withMaxBackReferenceLength(256);
      assertSame(parameters_Builder2, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(2);
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(128);
      parameters_Builder0.withNiceBackReferenceLength((-1408));
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals((-1408), parameters0.getLazyMatchingThreshold());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(128, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals((-1408), int0);
      assertEquals(128, parameters0.getMaxLiteralLength());
      assertEquals(127, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(127, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(8);
      parameters_Builder0.withMaxNumberOfCandidates((-1342));
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxCandidates();
      assertEquals(8, parameters0.getMaxLiteralLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals((-1342), int0);
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(3, parameters0.getLazyMatchingThreshold());
      assertEquals(7, parameters0.getMaxOffset());
      assertEquals(7, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getNiceBackReferenceLength());
      assertEquals(8, parameters0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withLazyThreshold(0);
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
      assertEquals(0, int0);
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(31, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withNiceBackReferenceLength((-860));
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals((-860), parameters0.getNiceBackReferenceLength());
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals((-860), int0);
      assertEquals(15, parameters0.getMaxOffset());
      assertEquals(15, parameters0.getMaxBackReferenceLength());
      assertEquals(16, parameters0.getWindowSize());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(8);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.tunedForSpeed();
      Parameters parameters0 = parameters_Builder1.build();
      boolean boolean0 = parameters0.getLazyMatching();
      assertEquals(7, parameters0.getMaxOffset());
      assertEquals(8, parameters0.getWindowSize());
      assertEquals(32, parameters0.getMaxCandidates());
      assertEquals(3, parameters0.getLazyMatchingThreshold());
      assertFalse(boolean0);
      assertEquals(8, parameters0.getMaxLiteralLength());
      assertEquals(7, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getNiceBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      // Undeclared exception!
      try { 
        parameters_Builder0.withMinBackReferenceLength(2438);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minBackReferenceLength can't be bigger than windowSize
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      parameters_Builder0.withMinBackReferenceLength(1024);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMinBackReferenceLength(1024);
      assertSame(parameters_Builder0, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxOffset((-2802));
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxOffset(1024);
      assertSame(parameters_Builder0, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxLiteralLength((-3524));
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxBackReferenceLength(0);
      assertSame(parameters_Builder0, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxBackReferenceLength(256);
      assertSame(parameters_Builder0, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      parameters_Builder0.withLazyMatching(true);
      Parameters parameters0 = parameters_Builder0.build();
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(7, parameters0.getLazyMatchingThreshold());
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals(7, parameters0.getNiceBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, parameters0.getMaxOffset());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(15, parameters0.getMaxBackReferenceLength());
      assertEquals(16, parameters0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parameters.builder(3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parameters.builder((-2948));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxLiteralLength();
      assertEquals(511, parameters0.getLazyMatchingThreshold());
      assertEquals(511, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertEquals(1024, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(1024, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals(511, int0);
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(1024, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(511, parameters0.getLazyMatchingThreshold());
      assertEquals(1024, parameters0.getMaxLiteralLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertEquals(1024, parameters0.getMaxLiteralLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(511, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(511, int0);
      assertEquals(1024, parameters0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxBackReferenceLength();
      assertEquals(1024, parameters0.getMaxLiteralLength());
      assertEquals(1023, int0);
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(511, parameters0.getLazyMatchingThreshold());
      assertEquals(1024, parameters0.getWindowSize());
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(511, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxOffset();
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(1024, parameters0.getMaxLiteralLength());
      assertEquals(511, parameters0.getLazyMatchingThreshold());
      assertEquals(511, parameters0.getNiceBackReferenceLength());
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertEquals(1023, int0);
      assertEquals(1024, parameters0.getWindowSize());
      assertTrue(parameters0.getLazyMatching());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxCandidates();
      assertEquals(511, parameters0.getLazyMatchingThreshold());
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(256, int0);
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(1024, parameters0.getWindowSize());
      assertEquals(511, parameters0.getNiceBackReferenceLength());
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(1024, parameters0.getMaxLiteralLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters parameters0 = parameters_Builder0.build();
      parameters0.getLazyMatching();
      assertEquals(127, parameters0.getLazyMatchingThreshold());
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(127, parameters0.getNiceBackReferenceLength());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getWindowSize();
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(1024, parameters0.getMaxLiteralLength());
      assertEquals(511, parameters0.getLazyMatchingThreshold());
      assertEquals(1024, int0);
      assertTrue(parameters0.getLazyMatching());
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertEquals(511, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.tunedForCompressionRatio();
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withNiceBackReferenceLength(0);
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(0, int0);
      assertEquals(0, parameters0.getLazyMatchingThreshold());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(1024, parameters0.getMaxLiteralLength());
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(1024, parameters0.getWindowSize());
  }
}
