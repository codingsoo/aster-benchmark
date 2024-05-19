
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.apache.commons.compress.utils.Iterators;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Iterators_ESTest extends Iterators_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(1);
      linkedList0.add((Object) integer0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>(linkedList0);
      linkedList0.add((Object) integer0);
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      boolean boolean0 = Iterators.addAll((Collection<Object>) linkedList1, (Iterator<?>) iterator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(1);
      linkedList0.add((Object) integer0);
      Iterator<Object> iterator0 = linkedList0.iterator();
      // Undeclared exception!
      try { 
        Iterators.addAll((Collection<Object>) linkedList0, (Iterator<?>) iterator0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ListIterator<Integer> listIterator0 = linkedList0.listIterator();
      // Undeclared exception!
      try { 
        Iterators.addAll((Collection<Integer>) null, (Iterator<? extends Integer>) listIterator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ListIterator<Integer> listIterator0 = linkedList0.listIterator(0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = Iterators.addAll((Collection<Object>) linkedList1, (Iterator<?>) listIterator0);
      assertFalse(boolean0);
  }
}
