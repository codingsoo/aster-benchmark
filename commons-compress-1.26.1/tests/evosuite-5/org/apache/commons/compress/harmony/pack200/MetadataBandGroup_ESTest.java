
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
import org.apache.commons.compress.harmony.pack200.IntList;
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      intArray0[0] = (-5);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(1955, intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      metadataBandGroup0.removeLatest();
      assertEquals(0, MetadataBandGroup.CONTEXT_CLASS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 22);
      int[] intArray0 = new int[2];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(1955, intArray0, metadataBandGroup0.casearray_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(0, metadataBandGroup0.numBackwardsCalls());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) metadataBandGroup0.T, locale_FilteringMode0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.casearray_N, list0, metadataBandGroup0.T, list0, linkedList1, linkedList2, metadataBandGroup0.T, list0, linkedList2);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) metadataBandGroup0.T, locale_FilteringMode0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(128, intArray0, metadataBandGroup0.param_NB, list0, list0, metadataBandGroup0.T, linkedList1, linkedList2, list0, metadataBandGroup0.T, linkedList2);
      assertFalse(list0.contains("b/;<'G'@y!L2a#v._"));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) metadataBandGroup0.T, locale_FilteringMode0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation((-5), intArray0, metadataBandGroup0.param_NB, list0, list0, list0, linkedList1, linkedList2, metadataBandGroup0.T, metadataBandGroup0.T, linkedList2);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-2267));
      linkedList1.add(integer0);
      metadataBandGroup0.addParameterAnnotation(1955, intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals((-4534), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(".64zyRc![", (-1362), (CpBands) null, segmentHeader0, 87);
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      IntList intList0 = metadataBandGroup0.pair_N;
      intList0.add(0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      metadataBandGroup0.addParameterAnnotation(1955, intArray0, intList0, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, (-2587), (CpBands) null, segmentHeader0, (-1271));
      int[] intArray0 = new int[9];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      linkedList0.add("|,@K");
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation((-2587), intArray0, metadataBandGroup0.anno_N, linkedList0, linkedList0, linkedList0, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 605, (CpBands) null, segmentHeader0, 0);
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("8=_C~Cx5P!", 631, (CpBands) null, segmentHeader0, 631);
      boolean boolean0 = metadataBandGroup0.hasContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[2];
      intArray0[0] = 627;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(1955, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
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
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("8=_C~Cx5P!", 631, (CpBands) null, segmentHeader0, 631);
      metadataBandGroup0.pack((OutputStream) null);
      assertEquals(2, MetadataBandGroup.CONTEXT_METHOD);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      assertEquals(0, metadataBandGroup0.numBackwardsCalls());
      
      int[] intArray0 = new int[2];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList1.add((Integer) 1);
      metadataBandGroup0.addParameterAnnotation(1955, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("*,$&,}!HS^V /Bmz[(H", 0, (CpBands) null, segmentHeader0, 83);
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("*,$&,}!HS^V /Bmz[(H", 0, (CpBands) null, segmentHeader0, 83);
      metadataBandGroup0.newEntryInAnnoN();
      metadataBandGroup0.incrementAnnoN();
      assertEquals(0, metadataBandGroup0.numBackwardsCalls());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b/;<'G'@y!L2a#v._", 627, (CpBands) null, segmentHeader0, 0);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(0, int0);
  }
}
