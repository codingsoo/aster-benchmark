
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
import org.apache.commons.codec.language.DaitchMokotoffSoundex;
import org.apache.commons.codec.language.Soundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StringEncoderComparator_ESTest extends StringEncoderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(daitchMokotoffSoundex0);
      int int0 = stringEncoderComparator0.compare("D@B~F&gu%", "375000");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(daitchMokotoffSoundex0);
      int int0 = stringEncoderComparator0.compare("375000", "D@B~F&gu%");
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Soundex soundex0 = new Soundex("o-,bC,[l;7xytaW,v8W", false);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(soundex0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringEncoderComparator0.compare("o-,bC,[l;7xytaW,v8W", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: X (index=23)
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
        stringEncoderComparator0.compare(object0, object0);
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
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      StringEncoderComparator stringEncoderComparator0 = new StringEncoderComparator(daitchMokotoffSoundex0);
      Object object0 = new Object();
      Integer integer0 = Integer.valueOf(1184);
      int int0 = stringEncoderComparator0.compare(object0, integer0);
      assertEquals(0, int0);
  }
}
