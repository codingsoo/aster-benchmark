
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
import org.apache.commons.codec.digest.Sha2Crypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Sha2Crypt_ESTest extends Sha2Crypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null, "", (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Sha2Crypt.sha256Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0, (String) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt(byteArray0, "ooGIFt7e0cHEMcQL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: ooGIFt7e0cHEMcQL
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Sha2Crypt.sha512Crypt(byteArray0, (String) null);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom();
      Sha2Crypt.sha256Crypt(byteArray0, (String) null, (Random) mockRandom0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, "$5$////////$igN1iyFB5jVmNkoeKsP7ABfGfTZQMb0pl2KLO/rNkUC", (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, "$6$........$l6P1lgRw5VxVCv5IO/2SS/vOBb94G7Z9gJxldKM5/Z520Xr1rDLMNwjxda4QZKSR2w2Oz5nywdj92BKWjk4WA0");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, "pJ<y7OB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: pJ<y7OB
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = Sha2Crypt.sha256Crypt(byteArray0, (String) null);
      assertEquals("$5$........$Ag7X0xA.A9ylhoaFlny3ed29yfqf99RIyhZqt7N4Mu8", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Sha2Crypt.sha512Crypt(byteArray0, (String) null, (Random) mockRandom0);
      assertEquals("$6$........$yzYL7F99CYTTZgvgLmcReyx48wDah4rRBD4a7sTTcZZPTEggBRLtDle1DKG4uB5E4eKmyGrbpshea/mhIeyfW/", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt(byteArray0, "a(;U7k_V^V3{%i;b_Pq", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: a(;U7k_V^V3{%i;b_Pq
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null, "C");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, " W-1", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value:  W-1
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      MockRandom mockRandom0 = new MockRandom();
      Sha2Crypt.sha256Crypt(byteArray0, (String) null, (Random) mockRandom0);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0, (String) null, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null, "Invalid salt value: ", (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sha2Crypt sha2Crypt0 = new Sha2Crypt();
  }
}
