
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
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnrecognizedExtraField_ESTest extends UnrecognizedExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[4];
      unrecognizedExtraField0.parseFromLocalFileData(byteArray0, 0, 0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[8];
      unrecognizedExtraField0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = unrecognizedExtraField0.getLocalFileDataData();
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[9];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 0);
      byte[] byteArray1 = unrecognizedExtraField0.getLocalFileDataData();
      assertNotNull(byteArray1);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[8];
      ZipShort zipShort0 = new ZipShort(byteArray0);
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertEquals(0, zipShort1.getValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)4;
      ZipShort zipShort0 = new ZipShort(byteArray0);
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertSame(zipShort1, zipShort0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = new ZipShort((-108));
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertEquals((-108), zipShort1.getValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[5];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)0);
      byte[] byteArray1 = unrecognizedExtraField0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (-1), (byte) (-10));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 > -11
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)56, 731);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (-1), (byte) (-21));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 > -22
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-59), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[8];
      unrecognizedExtraField0.setCentralDirectoryData(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[4];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)1, 1135);
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[4];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)1, 1135);
      ZipShort zipShort0 = unrecognizedExtraField0.getLocalFileDataLength();
      assertEquals(1135, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[4];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)1, 1135);
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
      assertEquals(1135, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[4];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)1, 1135);
      byte[] byteArray1 = unrecognizedExtraField0.getCentralDirectoryData();
      assertEquals(1135, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = unrecognizedExtraField0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getHeaderId();
      assertNull(zipShort0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData((byte[]) null, (byte)6, (byte)6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = unrecognizedExtraField0.getLocalFileDataData();
      assertNull(byteArray0);
  }
}
