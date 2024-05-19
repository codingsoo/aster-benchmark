
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.codec.digest.Md5Crypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Md5Crypt_ESTest extends Md5Crypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Md5Crypt.md5Crypt(byteArray0, (String) null, "org.apache.commons.codec.digest.B64");
      assertEquals("org.apache.commons.codec.digest.B64........$yAlziiWvhGTAlfxpHseQK0", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "$1$........$BA7je9r5zKe4IY981wb8v.");
      assertEquals("$1$........$bTtUql3/Wawqh.jbOopI01", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.B64", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$apr1$........$CtPKTharyFoM7A/bETpYC1", "4v93[}0ujc&", (Random) mockRandom0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 35
         // ^4v93[}0ujc&([\\.\\/a-zA-Z0-9]{1,8}).*
         //                                    ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "N]$H0Dl7$<KYQf", (String) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, " )%bc]7C*dU eM", " )%bc]7C*dU eM");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 1
         // ^ )%bc]7C*dU eM([\\.\\/a-zA-Z0-9]{1,8}).*
         //  ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$apr1$........$nuDztZ0kUaJLRq4o5A0EQ/", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt(byteArray0, "([./a-zA-Z0-9]{1,8}).*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$([./a-zA-Z0-9]{1,8}).*
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Md5Crypt.md5Crypt(byteArray0, "SHA-512", "^", (Random) mockRandom0);
      assertEquals("^SHA$RSJOD0Nf4gD/n9nDxhYgW0", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      byte[] byteArray0 = new byte[9];
      String string0 = Md5Crypt.md5Crypt(byteArray0, (String) null, "Rp|O", (Random) mockRandom0);
      assertEquals("Rp|O........$F4o11kwshcR5IRcK2TNlv0", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$1$........$bTtUql3/Wawqh.jbOopI01", "$1$........$BA7je9r5zKe4IY981wb8v.", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $1$........$bTtUql3/Wawqh.jbOopI01
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (String) null);
      assertEquals("$apr1$........$gQTJKsC.C5dCA8JQ0Atwl1", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, "$apr1$........$nuDztZ0kUaJLRq4o5A0EQ/");
      assertEquals("$apr1$........$nuDztZ0kUaJLRq4o5A0EQ/", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Md5Crypt.apr1Crypt(byteArray0);
      assertEquals("$apr1$........$nuDztZ0kUaJLRq4o5A0EQ/", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "ciS]@ejT;z^TS>q8@~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$apr1$5Rym$yNoLFWrxnX/mcs9DPCpjb0", "SHA-256");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$5Rym$yNoLFWrxnX/mcs9DPCpjb0
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Md5Crypt.apr1Crypt("`>+OCr<vtNVe)V*D", (String) null);
      byte[] byteArray0 = new byte[0];
      Md5Crypt.md5Crypt(byteArray0);
      Md5Crypt.apr1Crypt("$apr1$........$prfYOeLFkFHEk.T8sEx/m.");
      Md5Crypt.md5Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom();
      Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.apr1Crypt(byteArray0);
      Md5Crypt.apr1Crypt("qVHeFO06-oMb");
      // Undeclared exception!
      Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Md5Crypt md5Crypt0 = new Md5Crypt();
  }
}
