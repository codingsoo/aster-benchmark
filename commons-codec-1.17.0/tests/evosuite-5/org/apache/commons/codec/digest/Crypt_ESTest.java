
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
      byte[] byteArray0 = new byte[1];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt(byteArray0, "$6$........$J1sTuYA.cuEBHazrhK7aYVVJlJU8XLQQK8UTD7JaSlAJzieh.JqctLyAeUJdTdeb5NLC2EXTDTxrp9pnk8dK80");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Crypt.crypt(byteArray0);
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
      byte[] byteArray0 = new byte[1];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt("$6$........$J1sTuYA.cuEBHazrhK7aYVVJlJU8XLQQK8UTD7JaSlAJzieh.JqctLyAeUJdTdeb5NLC2EXTDTxrp9pnk8dK80", "$6$........$J1sTuYA.cuEBHazrhK7aYVVJlJU8XLQQK8UTD7JaSlAJzieh.JqctLyAeUJdTdeb5NLC2EXTDTxrp9pnk8dK80");
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
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      String string0 = Crypt.crypt(byteArray0, "ZX");
      assertEquals("ZXsGtBUajJ8sQ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((byte[]) null, "$6$i0v4p';V;Ail");
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
      String string0 = Crypt.crypt(byteArray0, (String) null);
      assertEquals("$6$........$oVMZogw/oFCGLIZ4Z5Kl3wc/XE5W8GqRP3uE/FVcG.B446FrG7UP8s2MkvOeWq2m8Zo5XS0au6iDeC0n1e.Ju1", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt("#5$", "#5$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: #5$
         //
         verifyException("org.apache.commons.codec.digest.UnixCrypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt("Jl$6$", "$5$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $5$
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Crypt.crypt("$6$........$J1sTuYA.cuEBHazrhK7aYVVJlJU8XLQQK8UTD7JaSlAJzieh.JqctLyAeUJdTdeb5NLC2EXTDTxrp9pnk8dK80", "$6$........$J1sTuYA.cuEBHazrhK7aYVVJlJU8XLQQK8UTD7JaSlAJzieh.JqctLyAeUJdTdeb5NLC2EXTDTxrp9pnk8dK80");
      assertEquals("$6$........$kj7NcDJYz8AvaAqaL8RGb3s89hVyeFE1yNAKCY9uKRPAwgD.Cd0wWqcorj9Txf3U3yUyYbqe9wy.3zpRk0qfF.", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = Crypt.crypt(byteArray0, "$1$u/");
      assertEquals("$1$u/$n8FmvU4DeiHGs.ds9FsQk0", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt("$6$........$1UFKxHIFqF1uoGYX77KWarDWdfHgpxGkyiqEbiSickfmzykQO5btGGTfe7.rMayXhOOYFIp8mRdtmY3pV2Ddb1");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Crypt crypt0 = new Crypt();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Crypt.crypt("$6$........$1UFKxHIFqF1uoGYX77KWarDWdfHgpxGkyiqEbiSickfmzykQO5btGGTfe7.rMayXhOOYFIp8mRdtmY3pV2Ddb1");
      assertEquals("$6$........$t2brD9aJQVGtUfJuKJ.IuhKDkUcQcSvYg3CNNAOPV34EIU0GEME/0J1A/AnI/08v3.t/HJHihmI2Y6I6Jf5/30", string0);
  }
}
