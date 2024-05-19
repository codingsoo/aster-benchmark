
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
import java.io.OutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.harmony.pack200.MetadataBandGroup;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MetadataBandGroup_ESTest extends MetadataBandGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("cp_Float", (-2940), (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[6];
      intArray0[5] = (-2940);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.anno_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(0, metadataBandGroup0.numBackwardsCalls());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("cp_Float", (-2940), (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[20];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      LinkedList<String> linkedList2 = new LinkedList<String>();
      linkedList2.add("cp_Float");
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, linkedList2, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("jdk}v", (-285), (CpBands) null, segmentHeader0, 0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList2, (Collection<String>) metadataBandGroup0.T, locale_FilteringMode0);
      int[] intArray0 = new int[6];
      metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, list0, metadataBandGroup0.T, linkedList0, linkedList1, list0, list0, linkedList1);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("jdk}v", (-285), (CpBands) null, segmentHeader0, 0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList2, (Collection<String>) metadataBandGroup0.T, locale_FilteringMode0);
      int[] intArray0 = new int[6];
      metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.casearray_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, list0, list0, linkedList1);
      assertEquals(0, MetadataBandGroup.CONTEXT_CLASS);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("cp_Float", (-2940), (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[6];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      LinkedList<String> linkedList2 = new LinkedList<String>();
      metadataBandGroup0.addParameterAnnotation(1151, intArray0, metadataBandGroup0.nestpair_N, metadataBandGroup0.T, linkedList2, linkedList2, linkedList0, linkedList1, linkedList2, metadataBandGroup0.T, linkedList1);
      assertFalse(metadataBandGroup0.hasContent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, 0, (CpBands) null, segmentHeader0, (-417));
      metadataBandGroup0.newEntryInAnnoN();
      metadataBandGroup0.incrementAnnoN();
      assertEquals(2, MetadataBandGroup.CONTEXT_METHOD);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("P&CUk2tK`H", (-256), (CpBands) null, segmentHeader0, (-408));
      // Undeclared exception!
      try { 
        metadataBandGroup0.removeLatest();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("jdk}v", (-276), (CpBands) null, segmentHeader0, 0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      int[] intArray0 = new int[6];
      metadataBandGroup0.pair_N.add(2);
      // Undeclared exception!
      metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("cp_Float", (-2940), (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation((-2940), intArray0, metadataBandGroup0.nestpair_N, (List<String>) null, (List<String>) null, (List<String>) null, (List<Object>) null, linkedList0, (List<String>) null, (List<String>) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("jdk}v", (-285), (CpBands) null, segmentHeader0, 0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        metadataBandGroup0.addAnnotation("", metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 10, (CpBands) null, segmentHeader0, 10);
      int[] intArray0 = new int[16];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      LinkedList<String> linkedList2 = new LinkedList<String>();
      metadataBandGroup0.addParameterAnnotation(10, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, linkedList2, linkedList1);
      metadataBandGroup0.removeLatest();
      assertFalse(metadataBandGroup0.hasContent());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, 0, (CpBands) null, segmentHeader0, (-417));
      metadataBandGroup0.pack((OutputStream) null);
      assertEquals(2, MetadataBandGroup.CONTEXT_METHOD);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("cp_Float", (-2940), (CpBands) null, segmentHeader0, 0);
      boolean boolean0 = metadataBandGroup0.hasContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("cp_Float", (-2940), (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[20];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList1.add((Integer) 1);
      LinkedList<String> linkedList2 = new LinkedList<String>();
      metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.casearray_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, linkedList2, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, 0, (CpBands) null, segmentHeader0, (-417));
      // Undeclared exception!
      try { 
        metadataBandGroup0.incrementAnnoN();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" bytes from cpString[", (-575), (CpBands) null, segmentHeader0, (-1771));
      metadataBandGroup0.newEntryInAnnoN();
      // Undeclared exception!
      try { 
        metadataBandGroup0.removeLatest();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 10, (CpBands) null, segmentHeader0, (-351));
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(0, int0);
  }
}
