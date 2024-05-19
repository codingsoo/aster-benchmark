
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


package org.apache.commons.compress.harmony.unpack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.IdentityHashMap;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentConstantPoolArrayCache_ESTest extends SegmentConstantPoolArrayCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[6];
      segmentConstantPoolArrayCache0.cacheArray(stringArray0);
      segmentConstantPoolArrayCache0.lastArray = stringArray0;
      IdentityHashMap<String[], SegmentConstantPoolArrayCache.CachedArray> identityHashMap0 = segmentConstantPoolArrayCache0.knownArrays;
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = identityHashMap0.replace(segmentConstantPoolArrayCache0.lastArray, (SegmentConstantPoolArrayCache.CachedArray) null);
      String[] stringArray1 = new String[5];
      identityHashMap0.put(stringArray1, segmentConstantPoolArrayCache_CachedArray0);
      segmentConstantPoolArrayCache0.cacheArray(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[6];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      segmentConstantPoolArrayCache_CachedArray0.cacheIndexes();
      assertEquals(6, segmentConstantPoolArrayCache_CachedArray0.lastKnownSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      List<Integer> list0 = segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, "");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[6];
      List<Integer> list0 = segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, "");
      assertNotNull(list0);
      
      boolean boolean0 = segmentConstantPoolArrayCache0.arrayIsCached(stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[1];
      boolean boolean0 = segmentConstantPoolArrayCache0.arrayIsCached(stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      // Undeclared exception!
      try { 
        segmentConstantPoolArrayCache0.indexesForArrayKey((String[]) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      // Undeclared exception!
      try { 
        segmentConstantPoolArrayCache0.cacheArray((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[6];
      segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, "");
      List<Integer> list0 = segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, "");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[4];
      IdentityHashMap<String[], SegmentConstantPoolArrayCache.CachedArray> identityHashMap0 = segmentConstantPoolArrayCache0.knownArrays;
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      segmentConstantPoolArrayCache_CachedArray0.lastKnownSize = (-3493);
      identityHashMap0.put(stringArray0, segmentConstantPoolArrayCache_CachedArray0);
      segmentConstantPoolArrayCache0.cacheArray(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[4];
      IdentityHashMap<String[], SegmentConstantPoolArrayCache.CachedArray> identityHashMap0 = segmentConstantPoolArrayCache0.knownArrays;
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      identityHashMap0.put(stringArray0, segmentConstantPoolArrayCache_CachedArray0);
      // Undeclared exception!
      try { 
        segmentConstantPoolArrayCache0.cacheArray(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Trying to cache an array that already exists
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[4];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      List<Integer> list0 = segmentConstantPoolArrayCache_CachedArray0.indexesForKey(stringArray0[2]);
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[0];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      List<Integer> list0 = segmentConstantPoolArrayCache_CachedArray0.indexesForKey("&A3 ");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[0];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      int int0 = segmentConstantPoolArrayCache_CachedArray0.lastKnownSize();
      assertEquals(0, int0);
  }
}
