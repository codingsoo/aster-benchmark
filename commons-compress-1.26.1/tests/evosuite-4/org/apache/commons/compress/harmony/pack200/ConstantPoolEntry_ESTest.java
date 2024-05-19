
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
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPLong;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantPoolEntry_ESTest extends ConstantPoolEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPLong cPLong0 = new CPLong(0L);
      assertEquals((-1), cPLong0.getIndex());
      
      cPLong0.setIndex(0);
      int int0 = cPLong0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.ConstantPoolEntry");
      cPUTF8_0.setIndex(475);
      int int0 = cPUTF8_0.getIndex();
      assertEquals(475, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("zc7?^%X");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      int int0 = cPClass0.getIndex();
      assertEquals((-1), int0);
  }
}
