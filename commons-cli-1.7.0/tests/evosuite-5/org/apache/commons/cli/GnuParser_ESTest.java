
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


package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GnuParser_ESTest extends GnuParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "org.apache.commons.cli.GnuParser";
      stringArray0[1] = "org.apache.commons.cli.Util";
      stringArray0[2] = "-]W=?wlhw%$~awN";
      stringArray0[3] = "-*";
      stringArray0[4] = "-]W=?wlhw%$~awN";
      // Undeclared exception!
      try { 
        gnuParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        gnuParser0.flatten((Options) null, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Trg.apache.commons.cli.GnuParser";
      stringArray0[1] = "Trg.apache.commons.cli.GnuParser";
      stringArray0[2] = "-]W=?wlhw%$~awN";
      stringArray0[3] = "-*";
      stringArray0[4] = "Trg.apache.commons.cli.GnuParser";
      stringArray0[5] = "--";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(8, stringArray1.length);
  }
}
