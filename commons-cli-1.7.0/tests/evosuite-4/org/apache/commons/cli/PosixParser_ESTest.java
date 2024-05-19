
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
import java.util.Properties;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      posixParser0.burstToken("", true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      // Undeclared exception!
      try { 
        posixParser0.burstToken("puuRe#j;'", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = " since ";
      stringArray0[1] = "";
      stringArray0[2] = "M";
      stringArray0[3] = "d_q3BPW3&T:0cs5jx?g";
      stringArray0[4] = "73";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "-4";
      // Undeclared exception!
      try { 
        posixParser0.flatten((Options) null, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PosixParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--";
      String[] stringArray1 = new String[0];
      posixParser0.parse(options0, stringArray1, false);
      stringArray0[1] = ")";
      Option option0 = new Option("Deprecated", "", true, "Deprecated");
      options0.addOption(option0);
      posixParser0.burstToken("--", false);
      String[] stringArray2 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(2, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-[";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(8, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "--:uUn$hRk;491V=Ow3`";
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        posixParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-~WlkvCF]/TF@|";
      stringArray0[1] = "-";
      stringArray0[2] = "(FMxxU5";
      stringArray0[3] = "#\"";
      stringArray0[4] = "--_";
      // Undeclared exception!
      try { 
        posixParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      posixParser0.parse(options0, stringArray0, false);
      Option option0 = new Option("Deprecated", "", true, "Deprecated");
      options0.addOption(option0);
      posixParser0.burstToken("--:uUn$hRk;491V=Ow3`", true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      posixParser0.parse(options0, stringArray0, false);
      posixParser0.burstToken("ZxXr", true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      posixParser0.parse(options0, stringArray0, false);
      Option option0 = new Option("Deprecated", "", false, "Deprecated");
      options0.addOption(option0);
      posixParser0.burstToken("--", false);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "";
      String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
      assertEquals(2, stringArray2.length);
  }
}
