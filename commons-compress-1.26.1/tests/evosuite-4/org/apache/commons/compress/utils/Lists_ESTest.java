
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.compress.utils.Lists;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Lists_ESTest extends Lists_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = false;
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      Lists.newArrayList((Iterator<? extends Integer>) iterator0);
      boolean boolean1 = true;
      Iterator<Object> iterator1 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iterator1).hasNext();
      doReturn((Object) null).when(iterator1).next();
      Lists.newArrayList((Iterator<?>) iterator1);
      Lists.newArrayList();
      Lists.newArrayList();
      ArrayList<Integer> arrayList0 = Lists.newArrayList();
      boolean boolean2 = true;
      Iterator<Integer> iterator2 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(boolean2, false).when(iterator2).hasNext();
      doReturn((Object) null).when(iterator2).next();
      ArrayList<Integer> arrayList1 = Lists.newArrayList((Iterator<? extends Integer>) iterator2);
      assertFalse(arrayList1.equals((Object)arrayList0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Lists.newArrayList((Iterator<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
