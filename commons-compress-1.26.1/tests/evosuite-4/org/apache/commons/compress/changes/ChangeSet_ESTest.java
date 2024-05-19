
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
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.apache.commons.compress.changes.Change;
import org.apache.commons.compress.changes.ChangeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChangeSet_ESTest extends ChangeSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("broken archive, entry with negative size", "broken archive, entry with negative size");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0);
      Set<Change<DumpArchiveEntry>> set0 = changeSet0.getChanges();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      // Undeclared exception!
      try { 
        changeSet0.deleteDir("9%`$O&a{Zh]?");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 6
         // 9%`$O&a{Zh]?/.*
         //       ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      // Undeclared exception!
      try { 
        changeSet0.deleteDir((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fileName
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      // Undeclared exception!
      try { 
        changeSet0.delete("_^&<])($!>5");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 5
         // _^&<])($!>5/.*
         //      ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      // Undeclared exception!
      try { 
        changeSet0.delete((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fileName
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.changes.ChangeSet", "");
      // Undeclared exception!
      try { 
        changeSet0.add(dumpArchiveEntry0, (InputStream) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // inputStream
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      // Undeclared exception!
      try { 
        changeSet0.add(dumpArchiveEntry0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // inputStream
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("ra", "+t;E");
      File file0 = MockFile.createTempFile(",Wv5Tw#UzJ", ",Wv5Tw#UzJ", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0);
      changeSet0.deleteDir("r<*~J@<pxaa\"9");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/.*", "+t;E");
      File file0 = MockFile.createTempFile("+t;E", "+t;E", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0);
      changeSet0.delete("/.*");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/.*", "+t;E");
      File file0 = MockFile.createTempFile("+t;E", "+t;E", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0);
      changeSet0.delete("-i0R06<h}b$Q-H");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/.*", "+t;E");
      File file0 = MockFile.createTempFile("+t;E", "+t;E", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0);
      changeSet0.deleteDir("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      changeSet0.deleteDir("<0&");
      changeSet0.delete("<0&");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      changeSet0.deleteDir("<0&");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0, false);
      assertEquals(0, dumpArchiveEntry0.getVolume());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/.*", "+t;E");
      File file0 = MockFile.createTempFile("+t;E", "+t;E", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      changeSet0.delete("/.*");
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0, true);
      assertEquals(DumpArchiveEntry.TYPE.UNKNOWN, dumpArchiveEntry0.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      Set<Change<DumpArchiveEntry>> set0 = changeSet0.getChanges();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/.*", "+t;E");
      File file0 = MockFile.createTempFile("+t;E", "+t;E", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) mockFileInputStream0, true);
      assertEquals("+t;E", dumpArchiveEntry0.getSimpleName());
  }
}
