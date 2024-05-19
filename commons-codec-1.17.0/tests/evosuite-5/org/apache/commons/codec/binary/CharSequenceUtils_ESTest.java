
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


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.codec.binary.CharSequenceUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CharSequenceUtils_ESTest extends CharSequenceUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(794);
      char[] charArray0 = new char[8];
      charArray0[1] = '%';
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, true, 225, charBuffer1, 1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(811);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, false, '\u0003', charBuffer0, 811, (-849));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = CharSequenceUtils.regionMatches("A<aKF", true, 13, "A<aKF", 1, 446);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = CharSequenceUtils.regionMatches("4z17vg{F,6:]dP02", true, 16, "4z7vg{F,6:]dP02", 0, 16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches((CharSequence) null, true, (-1073), (CharSequence) null, (-2348), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.CharSequenceUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(16);
      boolean boolean0 = CharSequenceUtils.regionMatches("4z17vg{F,6:]dP02", false, 0, charBuffer0, 0, 16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(811);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches(charBuffer0, true, 0, charBuffer0, '\u0003', 811);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(794);
      char[] charArray0 = new char[9];
      charArray0[0] = 'e';
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer1, true, 0, charBuffer0, 9, 242);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(794);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches("", true, 794, charBuffer0, (-2635), 794);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(794);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, false, 445, (CharSequence) null, (-3162), 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharSequenceUtils charSequenceUtils0 = new CharSequenceUtils();
  }
}
