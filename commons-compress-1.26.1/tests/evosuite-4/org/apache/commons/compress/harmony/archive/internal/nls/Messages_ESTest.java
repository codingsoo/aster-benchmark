
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


package org.apache.commons.compress.harmony.archive.internal.nls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.commons.compress.harmony.archive.internal.nls.Messages;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Messages_ESTest extends Messages_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Messages.getString("O8&Z{0-|HOoHzQAi", 2);
      assertEquals("O8&Z{0-|HOoHzQAi", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Messages.getString("-\"sKM?,KiE[{K\"", 'N');
      assertEquals("-\"sKM?,KiE[{K\"", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String string0 = Messages.getString("", objectArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Messages.getString("", (Object) "", (Object) "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Messages.getString("", (Object) " 'BE2)&-`IsQLRNCqW");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Messages.getString("", (-484));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Messages.getString("", 'V');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Messages.getString((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Messages.getString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String string0 = Messages.format("", objectArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Messages.setLocale((Locale) null, "{`LFyn@1<'bdu*paU$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        Messages.getString((String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Messages.getString((String) null, (Object) "W:<pX~C`Wr:j", (Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Messages.getString((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Messages.getString((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Messages.getString((String) null, 'V');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        Messages.format((String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String string0 = Messages.getString("K", objectArray0);
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String string0 = Messages.format("{{6DP!}&UzoJ2*3]", objectArray0);
      assertEquals("{{6DP!}&UzoJ2*3]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      String string0 = Messages.format("d:{yD}:2eii{", objectArray0);
      assertEquals("d:{yD}:2eii{", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Messages.getString("VtllbcX!<B");
      assertEquals("VtllbcX!<B", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Messages messages0 = new Messages();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = Messages.getString("9;:d9_zUhXrtMv", (Object) fileSystemHandling0);
      assertEquals("9;:d9_zUhXrtMv", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String string0 = Messages.getString("{{6DP!}&UzoJ2*3]", (Object) "{{6DP!}&UzoJ2*3]", objectArray0[0]);
      assertEquals("{{6DP!}&UzoJ2*3]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      ResourceBundle resourceBundle0 = Messages.setLocale(locale0, "YCYZ=Q=0y6C>1Y>=");
      assertNull(resourceBundle0);
  }
}
