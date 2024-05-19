
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
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      posixParser0.burstToken("m", false);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = posixParser0.flatten((Options) null, stringArray0, false);
      assertNotSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken(">b", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "org.apache.commons.cli.PosixParser";
      stringArray0[2] = "";
      stringArray0[3] = "[ Options: [ short ";
      stringArray0[4] = "YvQ$gz;";
      stringArray0[5] = "";
      stringArray0[6] = "s>dTpan%-a_3";
      posixParser0.flatten(options0, stringArray0, false);
      posixParser0.burstToken("Unrecognized option: ", true);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[15];
      stringArray0[0] = "-I";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertNotSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "---Deprecated";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      String[] stringArray1 = posixParser0.flatten((Options) null, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten((Options) null, stringArray1, true);
      assertEquals(5, stringArray1.length);
      assertEquals(6, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-s";
      stringArray0[1] = "--hD-ds)DZ/=";
      stringArray0[2] = "-s";
      stringArray0[3] = "-";
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "h Y;D78Irq`8~`O@e-*";
      stringArray0[1] = "h Y;D78Irq`8~`O@e-*";
      stringArray0[2] = "hD-ds)DZ/=";
      stringArray0[3] = "-<:";
      stringArray0[4] = "h Y;D78Irq`8~`O@e-*";
      stringArray0[5] = "eD]";
      posixParser0.flatten(options0, stringArray0, false);
      posixParser0.burstToken("hD-ds)DZ/=", true);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      posixParser0.burstToken("", false);
  }
}
