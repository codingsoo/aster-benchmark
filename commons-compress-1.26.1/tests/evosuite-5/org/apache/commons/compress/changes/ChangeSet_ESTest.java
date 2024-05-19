
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
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.apache.commons.compress.changes.Change;
import org.apache.commons.compress.changes.ChangeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChangeSet_ESTest extends ChangeSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      changeSet0.deleteDir("\"@?Mv");
      Set<Change<DumpArchiveEntry>> set0 = changeSet0.getChanges();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      // Undeclared exception!
      try { 
        changeSet0.deleteDir("S2<j7yPK?3PB\"U}[eTI");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 21
         // S2<j7yPK?3PB\"U}[eTI/.*
         //                      ^
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
        changeSet0.delete("(#OQE:s^eLFg@]Tva<");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 22
         // (#OQE:s^eLFg@]Tva</.*
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        changeSet0.add((DumpArchiveEntry) null, (InputStream) mockFileInputStream0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // archiveEntry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        changeSet0.add((DumpArchiveEntry) null, (InputStream) pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // archiveEntry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "$");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) pushbackInputStream0, false);
      changeSet0.delete("");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      PipedInputStream pipedInputStream0 = new PipedInputStream(530706950);
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("dAq<*!,U>I<ir,", "'jH<Yo*tXD%1k+e");
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      changeSet0.deleteDir("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      PipedInputStream pipedInputStream0 = new PipedInputStream(530706950);
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("dAq<*!,U>I<ir,", "'jH<Yo*tXD%1k+e");
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      changeSet0.delete("\"@?Mv");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      PipedInputStream pipedInputStream0 = new PipedInputStream(530706950);
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      changeSet0.delete("\"@?Mv");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      changeSet0.deleteDir("\"@?Mv");
      changeSet0.delete("\"@?Mv");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Z2R", "Z2R");
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      changeSet0.add(dumpArchiveEntry0, (InputStream) pushbackInputStream0, true);
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) sequenceInputStream0, false);
      assertEquals("Z2R", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      PipedInputStream pipedInputStream0 = new PipedInputStream(530706950);
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      assertEquals(0, dumpArchiveEntry0.getNlink());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      changeSet0.deleteDir("\"@?Mv");
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      PipedInputStream pipedInputStream0 = new PipedInputStream(530706950);
      changeSet0.add(dumpArchiveEntry0, (InputStream) pipedInputStream0);
      assertEquals(0, dumpArchiveEntry0.getNlink());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChangeSet<DumpArchiveEntry> changeSet0 = new ChangeSet<DumpArchiveEntry>();
      Set<Change<DumpArchiveEntry>> set0 = changeSet0.getChanges();
      assertEquals(0, set0.size());
  }
}
