
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


package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.parser.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Token token0 = Token.newToken(325);
      token0.image = "{4oXI|9[@xwV=";
      String string0 = token0.toString();
      assertEquals("{4oXI|9[@xwV=", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Token token0 = Token.newToken(0);
      token0.image = "";
      String string0 = token0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Token token0 = new Token();
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Token token0 = Token.newToken(0);
      String string0 = token0.toString();
      assertNull(string0);
  }
}
