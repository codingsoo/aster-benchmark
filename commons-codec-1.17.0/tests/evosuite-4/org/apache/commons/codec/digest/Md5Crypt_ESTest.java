
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
      String string0 = Md5Crypt.md5Crypt(byteArray0, "Ybc-5' $?X@M_[CD", "");
      assertEquals("Ybc$35P.fkR..SuC3pHs0jRsI/", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "$1$........$bTtUql3/Wawqh.jbOopI01");
      assertEquals("$1$........$bTtUql3/Wawqh.jbOopI01", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Md5Crypt.apr1Crypt(byteArray0);
      Md5Crypt.apr1Crypt(byteArray0, "M?rHE]");
      Md5Crypt.apr1Crypt(byteArray0, "OC5");
      Md5Crypt.apr1Crypt(byteArray0, "M?rHE]");
      Md5Crypt.apr1Crypt("$apr1$M$Oc9fWXwCkU5A2DZ56Nixq.");
      Md5Crypt.apr1Crypt(byteArray0);
      Md5Crypt.apr1Crypt("SHA3-256");
      Md5Crypt.md5Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom();
      Md5Crypt.md5Crypt(byteArray0, (String) null, "m=L@UW*w/&C~G", (Random) mockRandom0);
      // Undeclared exception!
      Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom((-1L));
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "[", "[", (Random) mockRandom0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 25
         // ^[([\\.\\/a-zA-Z0-9]{1,8}).*
         //                          ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "&2yCq1XQ|{1X", "&2yCq1XQ|{1X");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed counted closure near index 12
         // ^&2yCq1XQ|{1X([\\.\\/a-zA-Z0-9]{1,8}).*
         //             ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "s2o>:ZydSM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt(byteArray0, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.B64", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null, "$apr1$$apr1$........");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt(byteArray0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$
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
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Md5Crypt.md5Crypt(byteArray0, "tW'RTGTb ", "", (Random) mockRandom0);
      assertEquals("tW$07nNkHlJhNY.o31CElyvU/", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, (String) null, (String) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (String) null);
      assertEquals("$apr1$........$Dx84WbPshYwGywhfygLIB/", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "org.apache.commons.codec.digest.B64");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: org.apache.commons.codec.digest.B64
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$apr1$........$8t7NQCTjNZ4s.RRn81D70.", "$apr1$........$8t7NQCTjNZ4s.RRn81D70.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$........$8t7NQCTjNZ4s.RRn81D70.
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$1$...", "$apr1$$apr1$........$7733IIuo5Ub9Juw5QZBJM1", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $1$...
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Md5Crypt.apr1Crypt("h89prO8z|nP", (String) null);
      assertEquals("$apr1$........$o1PFTF97pECKOIQKW6Eon.", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      assertEquals("$apr1$........$nuDztZ0kUaJLRq4o5A0EQ/", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Md5Crypt md5Crypt0 = new Md5Crypt();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
      assertEquals("$1$........$bTtUql3/Wawqh.jbOopI01", string0);
  }
}
