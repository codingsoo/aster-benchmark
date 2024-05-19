
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
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMinBackReferenceLength(32);
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getMinBackReferenceLength();
      assertEquals(32, parameters0.getMaxBackReferenceLength());
      assertEquals(32, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(32, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(32, int0);
      assertEquals(32, parameters0.getMaxLiteralLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(1024);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxLiteralLength(218);
      Parameters parameters0 = parameters_Builder1.build();
      assertEquals(1023, parameters0.getMaxBackReferenceLength());
      assertEquals(511, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(1024, parameters0.getWindowSize());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(1023, parameters0.getMaxOffset());
      assertEquals(511, parameters0.getNiceBackReferenceLength());
      assertEquals(218, parameters0.getMaxLiteralLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withNiceBackReferenceLength(0);
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(0, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(0, int0);
      assertEquals(31, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withNiceBackReferenceLength((-1));
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertTrue(parameters0.getLazyMatching());
      assertEquals((-1), parameters0.getLazyMatchingThreshold());
      assertEquals(16, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals((-1), int0);
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals(15, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(8);
      parameters_Builder0.withMaxNumberOfCandidates(0);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxCandidates();
      assertTrue(parameters0.getLazyMatching());
      assertEquals(0, int0);
      assertEquals(8, parameters0.getMaxLiteralLength());
      assertEquals(3, parameters0.getLazyMatchingThreshold());
      assertEquals(7, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(8, parameters0.getWindowSize());
      assertEquals(7, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(128);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxNumberOfCandidates((-3310));
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getMaxCandidates();
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(127, parameters0.getMaxOffset());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(127, parameters0.getMaxBackReferenceLength());
      assertEquals(128, parameters0.getWindowSize());
      assertEquals(63, parameters0.getNiceBackReferenceLength());
      assertEquals(63, parameters0.getLazyMatchingThreshold());
      assertEquals(128, parameters0.getMaxLiteralLength());
      assertEquals((-3310), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      parameters_Builder0.withLazyThreshold(0);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(0, int0);
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(128);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withLazyThreshold((-652));
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(128, parameters0.getMaxLiteralLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(128, parameters0.getWindowSize());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(127, parameters0.getMaxOffset());
      assertEquals(127, parameters0.getMaxBackReferenceLength());
      assertEquals(63, parameters0.getNiceBackReferenceLength());
      assertEquals((-652), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMinBackReferenceLength(1);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(128);
      // Undeclared exception!
      try { 
        parameters_Builder0.withMinBackReferenceLength(717);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minBackReferenceLength can't be bigger than windowSize
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      parameters_Builder0.withMinBackReferenceLength(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxBackReferenceLength(32);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(2);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxOffset(0);
      assertSame(parameters_Builder0, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxOffset(32);
      assertSame(parameters_Builder0, parameters_Builder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(2);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxLiteralLength((-1));
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      parameters_Builder0.withMaxBackReferenceLength(0);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMinBackReferenceLength(1);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxBackReferenceLength(32);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parameters.builder(127);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parameters.builder((-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxLiteralLength();
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(15, parameters0.getLazyMatchingThreshold());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(32, int0);
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(15, parameters0.getLazyMatchingThreshold());
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(15, int0);
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, int0);
      assertEquals(31, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxBackReferenceLength();
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(31, int0);
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(15, parameters0.getLazyMatchingThreshold());
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxOffset();
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(31, int0);
      assertTrue(parameters0.getLazyMatching());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(15, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(32, parameters0.getMaxLiteralLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(8);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxCandidates();
      assertEquals(8, parameters0.getWindowSize());
      assertEquals(7, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getNiceBackReferenceLength());
      assertEquals(8, parameters0.getMaxLiteralLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(7, parameters0.getMaxBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, int0);
      assertEquals(3, parameters0.getLazyMatchingThreshold());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters parameters0 = parameters_Builder0.build();
      boolean boolean0 = parameters0.getLazyMatching();
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, parameters0.getLazyMatchingThreshold());
      assertTrue(boolean0);
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(32, parameters0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getWindowSize();
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(15, parameters0.getLazyMatchingThreshold());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(32, int0);
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(15, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      parameters_Builder0.tunedForCompressionRatio();
      Parameters parameters0 = parameters_Builder0.build();
      assertEquals(32, parameters0.getMaxCandidates());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(32, parameters0.getWindowSize());
      assertEquals(31, parameters0.getMaxOffset());
      assertEquals(31, parameters0.getNiceBackReferenceLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(31, parameters0.getLazyMatchingThreshold());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      parameters_Builder0.tunedForSpeed();
      Parameters parameters0 = parameters_Builder0.build();
      boolean boolean0 = parameters0.getLazyMatching();
      assertEquals(32, parameters0.getMaxCandidates());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(32, parameters0.getMaxLiteralLength());
      assertEquals(31, parameters0.getMaxBackReferenceLength());
      assertEquals(32, parameters0.getWindowSize());
      assertFalse(boolean0);
      assertEquals(3, parameters0.getLazyMatchingThreshold());
      assertEquals(3, parameters0.getNiceBackReferenceLength());
      assertEquals(31, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(8);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withLazyMatching(false);
      assertSame(parameters_Builder0, parameters_Builder1);
  }
}
