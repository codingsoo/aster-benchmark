
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


package org.apache.commons.compress.archivers.arj;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.arj.LocalFileHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocalFileHeader_ESTest extends LocalFileHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.originalSizeEvenForVolumes = (-2055);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=-2055, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileType = (-3897);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=-3897, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeCreated = (-697);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=-697, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeModified = (-2);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=-2, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.extendedFilePosition = 2573;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=2573, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.lastChapter = 2381;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=2381, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeAccessed = (-1922);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=-1922, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.firstChapter = 466;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=466, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.method = 1203;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=1203, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileSpecPosition = 5;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=5, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = 2146428891;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=2146428891, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.minVersionToExtract = (-1254);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=-1254, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.archiverVersionNumber = (-1037);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=-1037, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeAccessed = (-1922);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.dateTimeAccessed = (-2055);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.lastChapter = 3;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.lastChapter = 640;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.firstChapter = 3347;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.firstChapter = (-58);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileAccessMode = 146;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.originalCrc32 = 2035L;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.originalSize = (-3L);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.originalSize = (-3L);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      localFileHeader1.equals(localFileHeader0);
      assertFalse(localFileHeader0.equals((Object)localFileHeader1));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.compressedSize = (long) 9;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeModified = (-2);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.dateTimeModified = (-4049);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.reserved = (-1758);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileType = 1;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.fileType = 1;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.method = 2067;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.method = (-1083);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.arjFlags = 3834;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.hostOS = 2146428891;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.minVersionToExtract = (-1254);
      localFileHeader0.minVersionToExtract = 2381;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.minVersionToExtract = 2415;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.archiverVersionNumber = 251;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.archiverVersionNumber = 1551;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.fileSpecPosition = 16;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hashCode();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.name = "LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]";
      localFileHeader0.hashCode();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      byte[][] byteArray0 = new byte[1][9];
      localFileHeader0.extendedHeaders = byteArray0;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.comment = "";
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.name = "MED G";
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      localFileHeader1.originalSizeEvenForVolumes = (-1571);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeCreated = (-697);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.extendedFilePosition = 2573;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.firstChapter = 8;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.fileSpecPosition = 16;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.originalCrc32 = 2035L;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.compressedSize = (-1L);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.reserved = (-58);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.method = 1203;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.arjFlags = 3;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.hostOS = 2146428891;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalFileHeader.Flags localFileHeader_Flags0 = new LocalFileHeader.Flags();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalFileHeader.FileTypes localFileHeader_FileTypes0 = new LocalFileHeader.FileTypes();
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader_FileTypes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalFileHeader.Methods localFileHeader_Methods0 = new LocalFileHeader.Methods();
  }
}
