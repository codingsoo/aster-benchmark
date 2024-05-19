
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnicodeCommentExtraField_ESTest extends UnicodeCommentExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = null;
      try {
        unicodeCommentExtraField0 = new UnicodeCommentExtraField("fz`*!55#", (byte[]) null, 1323, (-3093));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("Be", byteArray0);
      assertEquals(3523407757L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = null;
      try {
        unicodeCommentExtraField0 = new UnicodeCommentExtraField("", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField", byteArray0, 0, 0);
      ZipShort zipShort0 = unicodeCommentExtraField0.getHeaderId();
      assertEquals(25461, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UnicodeCommentExtraField unicodeCommentExtraField0 = null;
      try {
        unicodeCommentExtraField0 = new UnicodeCommentExtraField("\"'D9j+v0%.rrP<cnmv", byteArray0, (byte)77, (-658));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }
}