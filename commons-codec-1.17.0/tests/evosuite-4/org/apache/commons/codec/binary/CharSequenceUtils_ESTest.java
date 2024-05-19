
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
  public void test0()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3547);
      CharBuffer charBuffer1 = charBuffer0.put(1655, 'I');
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer1, true, 24, charBuffer1, 1655, 1656);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2565);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, true, 2565, charBuffer0, 0, (-889));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3547);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches(charBuffer0, true, 1656, "", 48, 2902);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2565);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches(charBuffer0, true, 143, (CharSequence) null, 0, 472);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.CharSequenceUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1325);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches(charBuffer0, true, 0, charBuffer0, 3626, 3626);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3547);
      CharBuffer charBuffer1 = charBuffer0.put(1655, '\t');
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, false, '\t', charBuffer1, 0, 3547);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3547);
      charBuffer0.put(1655, '\t');
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, true, 1655, charBuffer0, 1656, 1656);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3547);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, true, 1656, charBuffer0, 1656, 1656);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CharSequenceUtils charSequenceUtils0 = new CharSequenceUtils();
  }
}
