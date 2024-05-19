
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
import java.io.File;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.InvalidPathException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveOutputStream_ESTest extends ZipArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[7];
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(path0, openOptionArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(path0, 0L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream((File) null, (-465L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "]..{d i0Z`:Hth,r}o~");
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(mockFile0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ZipArchiveOutputStream.UnicodeExtraFieldPolicy zipArchiveOutputStream_UnicodeExtraFieldPolicy0 = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
      String string0 = zipArchiveOutputStream_UnicodeExtraFieldPolicy0.toString();
      assertEquals("never", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      File file0 = MockFile.createTempFile(",JYH._%D)M$_(h770I@", ",JYH._%D)M$_(h770I@");
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(file0, 0L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("=i0f|VSG$Yk");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(fileChannel0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      File file0 = MockFile.createTempFile("7/Ibx^.&Je[:q>", "\u0000\u0000", (File) null);
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(file0);
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream((OutputStream) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }
}
