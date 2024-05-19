
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


package org.apache.commons.codec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.StringEncoderComparator;
import org.apache.commons.codec.language.Nysiis;
import org.apache.commons.codec.language.RefinedSoundex;
import org.apache.commons.codec.language.Soundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StringEncoderComparator_ESTest extends StringEncoderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(refinedSoundex0);
      Object object0 = new Object();
      int int0 = stringEncoderComparator0.compare(object0, object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(refinedSoundex0);
      int int0 = stringEncoderComparator0.compare("2{$=oX8+d2xPq", "");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Soundex soundex0 = new Soundex("D<)PE*tI<5RULhXxKz");
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(soundex0);
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("D<)PE*tI<5RULhXxKz", "D<)PE*tI<5RULhXxKz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: T (index=19)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare(stringEncoderComparator0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.StringEncoderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(nysiis0);
      int int0 = stringEncoderComparator0.compare("", "9hsAB#");
      assertEquals((-4), int0);
  }
}