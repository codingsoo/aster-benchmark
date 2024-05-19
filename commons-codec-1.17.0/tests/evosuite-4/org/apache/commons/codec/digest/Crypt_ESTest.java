
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
import org.apache.commons.codec.digest.Crypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Crypt_ESTest extends Crypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt(byteArray0, "$6$........$Q66Ga.UvQjhpprANqQAhQH9pICoRAqp8AUwXTQ1dHpSlK60kFjWgVMOYwNxZmbw0rgRYeefX659/2ZLcLnWHc.");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Crypt.crypt("(.%z4<@2de1@;Q");
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      Crypt.crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Crypt.crypt("");
      // Undeclared exception!
      Crypt.crypt("$6$........$sWKgbiiZSgXGWjaMn9tYypjfplSJ9NbJjZccM9ejKZiCAnoWoTFLmp1Xdo7r058CklQ.l5uTBfbMVvE7xsEPs0", "$6$........$sWKgbiiZSgXGWjaMn9tYypjfplSJ9NbJjZccM9ejKZiCAnoWoTFLmp1Xdo7r058CklQ.l5uTBfbMVvE7xsEPs0");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Crypt.crypt("+6t");
      // Undeclared exception!
      Crypt.crypt("4WxK[>eR?p>");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((byte[]) null, "$1$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Crypt.crypt(byteArray0, "$5$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $5$
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = Crypt.crypt(byteArray0, "$6$........$Q66Ga.UvQjhpprANqQAhQH9pICoRAqp8AUwXTQ1dHpSlK60kFjWgVMOYwNxZmbw0rgRYeefX659/2ZLcLnWHc.");
      assertEquals("$6$........$ZeWzPRqK2X/Ds1GTxGjj.x08x5EpLpy5Z7lAdAl73UfgD3M646x0m.0au2feMpVBuFiBPHxM7WNYMgGohF40J.", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = Crypt.crypt(byteArray0, (String) null);
      assertEquals("$6$........$RQw5pb5Ey.c4rfBffh.sgCHWsUbYK9kMrFMSVMSj88tm34Q2XaZx7MGbMx8JvGs5F/ztAeHfzjSyHurFb9BOH1", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Crypt.crypt(byteArray0, "$7$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $7$
         //
         verifyException("org.apache.commons.codec.digest.UnixCrypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt("&G;", "$5$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $5$
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Crypt.crypt("$6$........$sWKgbiiZSgXGWjaMn9tYypjfplSJ9NbJjZccM9ejKZiCAnoWoTFLmp1Xdo7r058CklQ.l5uTBfbMVvE7xsEPs0", "$6$........$sWKgbiiZSgXGWjaMn9tYypjfplSJ9NbJjZccM9ejKZiCAnoWoTFLmp1Xdo7r058CklQ.l5uTBfbMVvE7xsEPs0");
      assertEquals("$6$........$VobHBh0hED2TLhEuB9/WjEc17MwmBvu80DrM773QGHL6KTpUoN12C7WGK/o0nbQyC6H0bLL/AOJNi/Sq/dIeo1", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Crypt crypt0 = new Crypt();
  }
}
