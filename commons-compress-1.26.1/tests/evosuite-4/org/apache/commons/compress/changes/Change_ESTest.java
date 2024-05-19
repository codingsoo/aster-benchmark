
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.changes.Change;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Change_ESTest extends Change_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, false);
      boolean boolean0 = change0.isReplaceMode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("", (Change.ChangeType) null);
      change0.getType();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.ADD;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("R+xD=@H~I8jZQz9pG\"", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("R+xD=@H~I8jZQz9pG\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("", (Change.ChangeType) null);
      String string0 = change0.getTargetFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.MOVE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("Lm", change_ChangeType0);
      InputStream inputStream0 = change0.getInputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      jarArchiveEntry0.setSize(0L);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, false);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertEquals(0L, jarArchiveEntry1.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      jarArchiveEntry0.setSize(61440L);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertSame(jarArchiveEntry1, jarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("ADD");
      Change<JarArchiveEntry> change0 = null;
      try {
        change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, (InputStream) null, true);
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
      Change.ChangeType change_ChangeType0 = Change.ChangeType.ADD;
      Change<JarArchiveEntry> change0 = null;
      try {
        change0 = new Change<JarArchiveEntry>((String) null, change_ChangeType0);
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
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("", (Change.ChangeType) null);
      JarArchiveEntry jarArchiveEntry0 = change0.getEntry();
      assertNull(jarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      boolean boolean0 = change0.isReplaceMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      String string0 = change0.getTargetFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      InputStream inputStream0 = change0.getInputStream();
      assertSame(pipedInputStream0, inputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, jarArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      change0.getType();
  }
}
