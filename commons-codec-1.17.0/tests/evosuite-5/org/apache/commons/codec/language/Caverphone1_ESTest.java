
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


package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.Caverphone1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Caverphone1_ESTest extends Caverphone1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Caverphone1 caverphone1_0 = new Caverphone1();
      boolean boolean0 = caverphone1_0.isEncodeEqual("zT;sbNk_aTrEp4", "zT;sbNk_aTrEp4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Caverphone1 caverphone1_0 = new Caverphone1();
      String string0 = caverphone1_0.encode("b");
      assertEquals("P11111", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Caverphone1 caverphone1_0 = new Caverphone1();
      boolean boolean0 = caverphone1_0.isEncodeEqual("", (String) null);
      assertTrue(boolean0);
  }
}
