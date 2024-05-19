
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
import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class X0015_CertificateIdForFile_ESTest extends X0015_CertificateIdForFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)119;
      x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, 1, (byte)21);
      int int0 = x0015_CertificateIdForFile0.getRecordCount();
      assertEquals(119, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)1;
      x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)5);
      PKWareExtraHeader.HashAlgorithm pKWareExtraHeader_HashAlgorithm0 = x0015_CertificateIdForFile0.getHashAlgorithm();
      assertEquals(PKWareExtraHeader.HashAlgorithm.CRC32, pKWareExtraHeader_HashAlgorithm0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[18];
      try { 
        x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, (byte) (-1), (byte) (-1));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile is too short, only -1 bytes, expected at least 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      // Undeclared exception!
      try { 
        x0015_CertificateIdForFile0.parseFromCentralDirectoryData((byte[]) null, (-735), 3178);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, 0, 1900);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[7];
      x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)61);
      PKWareExtraHeader.HashAlgorithm pKWareExtraHeader_HashAlgorithm0 = x0015_CertificateIdForFile0.getHashAlgorithm();
      assertEquals(PKWareExtraHeader.HashAlgorithm.NONE, pKWareExtraHeader_HashAlgorithm0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      int int0 = x0015_CertificateIdForFile0.getRecordCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      x0015_CertificateIdForFile0.getHashAlgorithm();
  }
}