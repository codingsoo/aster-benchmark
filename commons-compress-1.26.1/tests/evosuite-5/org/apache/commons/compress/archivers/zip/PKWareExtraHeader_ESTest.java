
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
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory;
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PKWareExtraHeader_ESTest extends PKWareExtraHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      x0017_StrongEncryptionHeader0.assertMinimalLength(2, 2);
      assertNull(x0017_StrongEncryptionHeader0.getHashAlgorithm());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode((-390));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[6];
      x0016_CertificateIdForCentralDirectory0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataData();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[1];
      x0019_EncryptionRecipientCertificateList0.parseFromLocalFileData(byteArray0, (byte)0, (byte)0);
      byte[] byteArray1 = x0019_EncryptionRecipientCertificateList0.getLocalFileDataData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[2];
      x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData(byteArray0, 0, 0);
      byte[] byteArray1 = x0019_EncryptionRecipientCertificateList0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      // Undeclared exception!
      try { 
        x0015_CertificateIdForFile0.parseFromLocalFileData((byte[]) null, 519, 519);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      // Undeclared exception!
      try { 
        x0015_CertificateIdForFile0.parseFromLocalFileData((byte[]) null, (byte)0, (-1735));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -1735
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, (byte)87, (byte)87);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[7];
      try { 
        x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, (byte) (-54), (byte) (-54));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile is too short, only -54 bytes, expected at least 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      // Undeclared exception!
      try { 
        x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData((byte[]) null, 21, 1524);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromCentralDirectoryData(byteArray0, 0, (-194));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -194
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData(byteArray0, (-763), (byte)0);
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
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      try { 
        x0014_X509Certificates0.assertMinimalLength(341, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0014_X509Certificates is too short, only 0 bytes, expected at least 341
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      ZipShort zipShort0 = x0015_CertificateIdForFile0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[1];
      x0017_StrongEncryptionHeader0.setLocalFileDataData(byteArray0);
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 1, (byte)0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 12
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[6];
      x0016_CertificateIdForCentralDirectory0.setLocalFileDataData(byteArray0);
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataLength();
      assertEquals(6, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[5];
      x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray0);
      ZipShort zipShort0 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
      assertEquals(5, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = x0017_StrongEncryptionHeader0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm pKWareExtraHeader_EncryptionAlgorithm0 = PKWareExtraHeader.EncryptionAlgorithm.AES192;
      int int0 = pKWareExtraHeader_EncryptionAlgorithm0.getCode();
      assertEquals(26127, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 1, (byte)94);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm pKWareExtraHeader_HashAlgorithm0 = PKWareExtraHeader.HashAlgorithm.NONE;
      int int0 = pKWareExtraHeader_HashAlgorithm0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm pKWareExtraHeader_HashAlgorithm0 = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode((byte)0);
      assertEquals(0, pKWareExtraHeader_HashAlgorithm0.getCode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[1];
      x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray0);
      byte[] byteArray1 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      ZipShort zipShort0 = x0017_StrongEncryptionHeader0.getHeaderId();
      assertEquals(23, zipShort0.getValue());
  }
}
