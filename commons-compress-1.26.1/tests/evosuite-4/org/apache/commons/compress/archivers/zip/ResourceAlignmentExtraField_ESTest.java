
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
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ResourceAlignmentExtraField_ESTest extends ResourceAlignmentExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0, false);
      byte[] byteArray0 = resourceAlignmentExtraField0.getLocalFileDataData();
      resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, (short)0, 238);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      
      ZipShort zipShort0 = resourceAlignmentExtraField0.getLocalFileDataLength();
      assertEquals(238, zipShort0.getValue());
      assertEquals((short)0, resourceAlignmentExtraField0.getAlignment());
      assertFalse(resourceAlignmentExtraField0.allowMethodChange());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(32767, false, 46);
      byte[] byteArray0 = resourceAlignmentExtraField0.getLocalFileDataData();
      assertFalse(resourceAlignmentExtraField0.allowMethodChange());
      assertEquals(48, byteArray0.length);
      assertEquals((short)32767, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(1824, true, 1824);
      short short0 = resourceAlignmentExtraField0.getAlignment();
      assertEquals((short)1824, short0);
      assertTrue(resourceAlignmentExtraField0.allowMethodChange());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0, true, 32768);
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromLocalFileData((byte[]) null, 0, 2963);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, (byte)23, (byte)23);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 23
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(933, true, 933);
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromCentralDirectoryData((byte[]) null, 933, 933);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(32767, false, 46);
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-120);
      resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 565);
      assertEquals((short)2048, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-41), (byte)98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -41
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(2);
      byte[] byteArray0 = new byte[4];
      try { 
        resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, (-1), 1);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Too short content for ResourceAlignmentExtraField (0xa11e): 1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-84);
      resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 2);
      boolean boolean0 = resourceAlignmentExtraField0.allowMethodChange();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(1745, true, 0);
      byte[] byteArray0 = new byte[2];
      try { 
        resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, 0, (-1904));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Too short content for ResourceAlignmentExtraField (0xa11e): -1904
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0, false);
      byte[] byteArray0 = resourceAlignmentExtraField0.getLocalFileDataData();
      resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 238);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals((short)0, resourceAlignmentExtraField0.getAlignment());
      assertFalse(resourceAlignmentExtraField0.allowMethodChange());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0, true, 32768);
      byte[] byteArray0 = resourceAlignmentExtraField0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-128)}, byteArray0);
      assertEquals((short)0, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0, false);
      byte[] byteArray0 = resourceAlignmentExtraField0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = null;
      try {
        resourceAlignmentExtraField0 = new ResourceAlignmentExtraField((byte)2, false, (-813));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Padding must not be negative, was: -813
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = null;
      try {
        resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(41258);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Alignment must be between 0 and 0x7fff, was: 41258
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(1745, true, 0);
      byte[] byteArray0 = resourceAlignmentExtraField0.getLocalFileDataData();
      assertEquals(2, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-47), (byte) (-122)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      ZipShort zipShort0 = resourceAlignmentExtraField0.getHeaderId();
      assertEquals(41246, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      ZipShort zipShort0 = resourceAlignmentExtraField0.getCentralDirectoryLength();
      assertEquals(2, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      boolean boolean0 = resourceAlignmentExtraField0.allowMethodChange();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = null;
      try {
        resourceAlignmentExtraField0 = new ResourceAlignmentExtraField((-2365));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Alignment must be between 0 and 0x7fff, was: -2365
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      short short0 = resourceAlignmentExtraField0.getAlignment();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = null;
      try {
        resourceAlignmentExtraField0 = new ResourceAlignmentExtraField((-1), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Alignment must be between 0 and 0x7fff, was: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }
}
