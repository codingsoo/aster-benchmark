
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
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractUnicodeExtraField_ESTest extends AbstractUnicodeExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("UniCoHe path extra data must have at least 5 ]ytes.", byteArray0, 4, (byte)0);
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 1922);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-98);
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("", byteArray0);
      try { 
        unicodePathExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (byte)100);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Unsupported version [-98] for UniCode path extra data.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("UniCoHe path extra data must have at least 5 ]ytes.", byteArray0, 4, (byte)0);
      unicodeCommentExtraField0.getUnicodeName();
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)1;
      byteArray0[4] = (byte)1;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("UniCoHe path extra data must have at least 5 ]ytes.", byteArray0, 4, (byte)0);
      unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, 5);
      long long0 = unicodeCommentExtraField0.getNameCRC32();
      assertEquals(16777216L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.setNameCRC32((-449L));
      long long0 = unicodeCommentExtraField0.getNameCRC32();
      assertEquals((-449L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromLocalFileData((byte[]) null, 3121, 3121);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromCentralDirectoryData((byte[]) null, (-1504), 25461);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, 2470, 4277);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2470
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)1;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("UniCoHe path extra data must have at least 5 ]ytes.", byteArray0, 4, (byte)0);
      unicodeCommentExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 5);
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      ZipShort zipShort0 = unicodePathExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("UniCoHe path extra data must have at least 5 ]ytes.", byteArray0, 4, (byte)0);
      ZipShort zipShort0 = unicodeCommentExtraField0.getCentralDirectoryLength();
      assertEquals(56, zipShort0.getValue());
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("UniCoHe path extra data must have at least 5 ]ytes.", byteArray0, 4, (byte)0);
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      assertNotNull(byteArray1);
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
      assertEquals(56, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.setUnicodeName(byteArray0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      unicodePathExtraField0.setUnicodeName((byte[]) null);
      assertEquals(0L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      try { 
        unicodeCommentExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (byte)0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, 5);
      byte[] byteArray1 = unicodeCommentExtraField0.getUnicodeName();
      assertEquals(0, byteArray1.length);
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = unicodeCommentExtraField0.getUnicodeName();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      ZipShort zipShort0 = unicodePathExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, 5);
      byte[] byteArray1 = unicodeCommentExtraField0.getLocalFileDataData();
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      
      ZipShort zipShort0 = unicodeCommentExtraField0.getCentralDirectoryLength();
      assertEquals(5, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, 5);
      unicodeCommentExtraField0.getLocalFileDataData();
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(5, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      try { 
        unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, 5);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Unsupported version [0] for UniCode path extra data.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("UniCoHe path extra data must have at least 5 ]ytes.", byteArray0, 4, (byte)0);
      ZipShort zipShort0 = unicodeCommentExtraField0.getLocalFileDataLength();
      assertEquals(56, zipShort0.getValue());
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = unicodeCommentExtraField0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      long long0 = unicodeCommentExtraField0.getNameCRC32();
      assertEquals(0L, long0);
  }
}
