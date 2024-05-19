
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
import org.apache.commons.compress.harmony.pack200.IntList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IntList_ESTest extends IntList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntList intList0 = new IntList(9992);
      // Undeclared exception!
      try { 
        intList0.increment(855);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 855
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntList intList0 = new IntList(2548);
      intList0.add(0);
      intList0.add(2548);
      intList0.add(0, 0);
      assertEquals(3, intList0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0, (-1));
      IntList intList1 = new IntList();
      intList1.addAll(intList0);
      assertEquals(1, intList0.size());
      assertFalse(intList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.add((-1152), (-901));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0, (-1));
      intList0.toArray();
      assertEquals(1, intList0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0, 2);
      int int0 = intList0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add((-17));
      assertEquals(1, intList0.size());
      
      int int0 = intList0.remove(0);
      assertEquals((-17), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.addAll((IntList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      intList0.get(0);
      assertEquals(1, intList0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntList intList0 = new IntList();
      int int0 = intList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 10);
      assertEquals(1, intList0.size());
      
      intList0.remove(0);
      assertTrue(intList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0, 0);
      intList0.add(2);
      intList0.remove(0);
      // Undeclared exception!
      try { 
        intList0.get(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.remove(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.remove((-3470));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntList intList0 = new IntList();
      boolean boolean0 = intList0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add((-718));
      boolean boolean0 = intList0.isEmpty();
      assertEquals(1, intList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      intList0.increment(0);
      int int0 = intList0.get(0);
      assertEquals(1, intList0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.increment(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.increment((-1213));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -1213
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      IntList intList1 = new IntList();
      intList0.addAll(intList1);
      intList0.add(0, 0);
      assertEquals(2, intList0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.get(27);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 27
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.get((-3402));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -3402
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0, (-3402));
      assertEquals(1, intList0.size());
      
      intList0.clear();
      assertEquals(0, intList0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      IntList intList1 = new IntList();
      intList0.addAll(intList1);
      intList0.add(1, 0);
      assertEquals(2, intList0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      intList0.add(1, 0);
      intList0.remove(1);
      assertFalse(intList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, (-2132));
      intList0.add(0, (-1023));
      assertEquals(2, intList0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.add(1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      // Undeclared exception!
      intList0.addAll(intList0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntList intList0 = null;
      try {
        intList0 = new IntList((-167));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IntList intList0 = new IntList(0);
      int[] intArray0 = intList0.toArray();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.clear();
      assertTrue(intList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.addAll(intList0);
      assertEquals(0, intList0.size());
  }
}