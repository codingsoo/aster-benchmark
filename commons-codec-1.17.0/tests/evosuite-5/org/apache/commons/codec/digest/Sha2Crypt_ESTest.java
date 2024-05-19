
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
      byte[] byteArray0 = new byte[1];
      Sha2Crypt.sha512Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0, "$6$........$0UhVj1i40njMLHg7txoLCCiCdi6.r80p9xUxp1J9uUMg6TqXxYA0Ik6xzk1OMvrQ5D9HWejVCpGVPeZchsvTZ1", (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt(byteArray0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
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
      byte[] byteArray0 = new byte[10];
      Sha2Crypt.sha256Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom((-3816L));
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, "$5$........$NGwjej23BmLQRK731ss5O8v6DNWq2fIcN8q5g.0aju/", (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1704L);
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null, (String) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, "$6$........$44i8IrXs6bJRxxD8r3JmExrxuqINB/ypeeRZznDnb/6q3OYIYumS/OYD3Ht2fsg.nievq.hknHbhKgoWbzNAN/");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null, "org.apache.commons.codec.digest.Sha2Crypt");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
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
      byte[] byteArray0 = new byte[9];
      String string0 = Sha2Crypt.sha512Crypt(byteArray0, (String) null);
      assertEquals("$6$........$ySXDRzYM5JmIgdsxCS5XnnG7cR8/KDnni0CSpLtdvsE3BMmpOM5E7kYc8mSMQ6ESi6ZlUqIz8yDtTF5OUzVw.0", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Sha2Crypt.sha256Crypt(byteArray0, (String) null);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom(193L);
      String string0 = Sha2Crypt.sha512Crypt(byteArray0, (String) null, (Random) mockRandom0);
      assertEquals("$6$........$54kRZNeK.pNNeSXd2oLXU.atT8XVxIkHC.RlTeB/FuOGoA3gmo6xk9yT.R.V1Lu.p5TPYB9jgncVpU4ONZnZL.", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockRandom mockRandom0 = new MockRandom((byte)0);
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt(byteArray0, "Dbg", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: Dbg
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, "p", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: p
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Sha2Crypt.sha256Crypt(byteArray0, (String) null, (Random) mockRandom0);
      assertEquals("$5$........$Ag7X0xA.A9ylhoaFlny3ed29yfqf99RIyhZqt7N4Mu8", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sha2Crypt sha2Crypt0 = new Sha2Crypt();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Sha2Crypt.sha256Crypt(byteArray0);
      byte[] byteArray1 = new byte[8];
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray1, (String) null);
  }
}
