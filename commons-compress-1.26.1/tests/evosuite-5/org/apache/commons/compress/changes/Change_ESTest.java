
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


package org.apache.commons.compress.changes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.changes.Change;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Change_ESTest extends Change_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("inputStream", false);
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, sequenceInputStream0, false);
      boolean boolean0 = change0.isReplaceMode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>("", (Change.ChangeType) null);
      change0.getType();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("inputStream", false);
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, sequenceInputStream0, false);
      String string0 = change0.getTargetFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>("", (Change.ChangeType) null);
      String string0 = change0.getTargetFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("K_YBqWV]#B]");
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2318, (-2513));
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, byteArrayInputStream0, false);
      InputStream inputStream0 = change0.getInputStream();
      assertSame(inputStream0, byteArrayInputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("4|X$3UqRh0)(^>`?%7", (byte)0, true);
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, byteArrayInputStream0, true);
      TarArchiveEntry tarArchiveEntry1 = change0.getEntry();
      assertEquals(0L, tarArchiveEntry1.getRealSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("inputStream", false);
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, sequenceInputStream0, false);
      tarArchiveEntry0.setSize(2140L);
      TarArchiveEntry tarArchiveEntry1 = change0.getEntry();
      assertEquals("inputStream", tarArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Uamv23@c3");
      Change<TarArchiveEntry> change0 = null;
      try {
        change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, (InputStream) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // inputStream
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<TarArchiveEntry> change0 = null;
      try {
        change0 = new Change<TarArchiveEntry>((String) null, change_ChangeType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fileName
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>("V", change_ChangeType0);
      boolean boolean0 = change0.isReplaceMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>("V", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("V", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>("V", change_ChangeType0);
      InputStream inputStream0 = change0.getInputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>("V", change_ChangeType0);
      TarArchiveEntry tarArchiveEntry0 = change0.getEntry();
      assertNull(tarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("inputStream", false);
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, sequenceInputStream0, false);
      change0.getType();
  }
}
