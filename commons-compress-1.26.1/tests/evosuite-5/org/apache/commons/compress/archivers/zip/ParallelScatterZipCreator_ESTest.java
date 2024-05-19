
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier;
import org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator;
import org.apache.commons.compress.archivers.zip.ScatterZipOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParallelScatterZipCreator_ESTest extends ParallelScatterZipCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("k_0'i$8");
      MockFile mockFile1 = new MockFile(mockFile0, "k_0'i$8");
      Path path0 = mockFile1.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, defaultBackingStoreSupplier0, 0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(363);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.createCallable(zipArchiveEntry1, inputStreamSupplier0);
      zipArchiveEntry0.getCentralDirectoryExtra();
      zipArchiveEntry0.getCreationTime();
      zipArchiveEntry0.setComment("6R'{*+");
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(mockFile1, (-1));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForkJoinTask.getPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.writeTo((ZipArchiveOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForkJoinTask.getPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntryRequestSupplier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, (-2329));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, (ScatterGatherBackingStoreSupplier) null);
      Callable<LinkOption> callable0 = null;
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submit((Callable<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1074);
      MockFile mockFile0 = new MockFile("@R(kRx'eq");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, defaultBackingStoreSupplier0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = null;
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntry) null, inputStreamSupplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 9;
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(9);
      Callable<CompletableFuture<ScatterZipOutputStream>> callable0 = (Callable<CompletableFuture<ScatterZipOutputStream>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      forkJoinPool0.submit(callable0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.getStatisticsMessage();
      forkJoinPool0.shutdown();
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ForkJoinPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      Callable<ScatterZipOutputStream> callable0 = null;
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submitStreamAwareCallable((Callable<? extends ScatterZipOutputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.AbstractExecutorService", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      String string0 = "";
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, 35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Z9q_rtoS)(9Slyq&db");
      String string0 = "";
      zipArchiveEntry0.setComment("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: Z9q_rtoS)(9Slyq&db
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1268);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)32;
      byteArray0[3] = (byte) (-55);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-98);
      byteArray0[7] = (byte) (-1);
      byteArrayOutputStream0.write(byteArray0);
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(byteArrayOutputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = null;
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.createCallable(zipArchiveEntry0, (InputStreamSupplier) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      MockFile mockFile0 = new MockFile("[WazC\u0004W?{3FYpv");
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
  public void test14()  throws Throwable  {
      int int0 = 0;
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      scheduledThreadPoolExecutor0.setMaximumPoolSize(1334);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, (ScatterGatherBackingStoreSupplier) null, 0);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
      parallelScatterZipCreator0.getStatisticsMessage();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      PipedOutputStream pipedOutputStream1 = null;
      try {
        pipedOutputStream1 = new PipedOutputStream(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
          Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable((ZipArchiveEntryRequestSupplier) null);
          parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
          parallelScatterZipCreator0.getStatisticsMessage();
          parallelScatterZipCreator0.submit(callable0);
          JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator");
          InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
          // Undeclared exception!
          try { 
            parallelScatterZipCreator0.createCallable((ZipArchiveEntry) jarArchiveEntry0, inputStreamSupplier0);
            fail("Expecting exception: IllegalArgumentException");
          
          } catch(IllegalArgumentException e) {
             //
             // Method must be set on zipArchiveEntry: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator
             //
             verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
