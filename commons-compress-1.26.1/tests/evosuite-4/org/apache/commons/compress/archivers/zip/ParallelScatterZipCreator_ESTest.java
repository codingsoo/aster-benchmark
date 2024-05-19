
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
import java.io.File;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier;
import org.apache.commons.compress.archivers.zip.NioZipEncoding;
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
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParallelScatterZipCreator_ESTest extends ParallelScatterZipCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submit(callable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
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
  public void test02()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
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
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
          LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
          linkedBlockingQueue0.isEmpty();
          ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(3062, 3062, 3062, timeUnit0, linkedBlockingQueue0);
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(threadPoolExecutor0);
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = null;
          Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable((ZipArchiveEntryRequestSupplier) null);
          parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
          parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
          URI uRI0 = MockURI.aFileURI;
          String string0 = "+z)";
          URI uRI1 = MockURI.resolve(uRI0, "+z)");
          MockFile mockFile0 = new MockFile(uRI1);
          ZipArchiveOutputStream zipArchiveOutputStream0 = null;
          try {
            zipArchiveOutputStream0 = new ZipArchiveOutputStream(mockFile0, 3062);
            fail("Expecting exception: NoClassDefFoundError");
          
          } catch(NoClassDefFoundError e) {
             //
             // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
             //
             verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
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
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(250, threadPoolExecutor_CallerRunsPolicy0);
      String string0 = "{'.";
      scheduledThreadPoolExecutor0.getMaximumPoolSize();
      MockFile mockFile0 = new MockFile("So1J?M21U'ST", "{'.");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, defaultBackingStoreSupplier0, (-2111));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      MockFile mockFile0 = new MockFile("9?d!W4Bb\b{-uZ1i");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, 86);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.createCallable(zipArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("7$Vm/DM^h");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntry) jarArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 7$Vm/DM^h
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, (ScatterGatherBackingStoreSupplier) null, 1);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
      ZipEntry zipEntry0 = new ZipEntry("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator");
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry(zipEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
          parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
          ZipArchiveEntry zipArchiveEntry0 = null;
          InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
          // Undeclared exception!
          try { 
            parallelScatterZipCreator0.createCallable((ZipArchiveEntry) null, inputStreamSupplier0);
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      PriorityBlockingQueue<Runnable> priorityBlockingQueue0 = new PriorityBlockingQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread();
      MockThread mockThread1 = new MockThread(threadGroup0, mockThread0);
      MockThread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
      MockThread.reset();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(2463);
      threadPoolExecutor_DiscardOldestPolicy0.rejectedExecution(mockThread1, scheduledThreadPoolExecutor0);
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(2463, 2463, 2463, timeUnit0, priorityBlockingQueue0, threadFactory0, threadPoolExecutor_DiscardOldestPolicy0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(threadPoolExecutor0);
      parallelScatterZipCreator0.getStatisticsMessage();
      parallelScatterZipCreator0.getStatisticsMessage();
      String string0 = "^kM]\"rv&Tm3:";
      // Undeclared exception!
      try { 
        MockURI.create("^kM]\"rv&Tm3:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in scheme name at index 0: ^kM]\"rv&Tm3:
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream((SeekableByteChannel) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      JarEntry jarEntry0 = new JarEntry("Compression level is expected between -1~9");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)77;
      byteArray0[1] = (byte) (-30);
      byteArray0[2] = (byte) (-40);
      byteArray0[3] = (byte) (-85);
      byteArray0[4] = (byte)93;
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding((Charset) null, false);
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, nioZipEncoding0, false, 1L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(3284);
          ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
          scheduledThreadPoolExecutor0.setRejectedExecutionHandler(threadPoolExecutor_AbortPolicy0);
          MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$1");
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
          Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable((ZipArchiveEntryRequestSupplier) null);
          FutureTask<ScatterZipOutputStream> futureTask0 = new FutureTask<ScatterZipOutputStream>(callable0);
          MockThread mockThread0 = new MockThread(futureTask0);
          TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
          scheduledThreadPoolExecutor0.scheduleAtFixedRate(mockThread0, 3284, 3284, timeUnit0);
          Path path0 = mockFile0.toPath();
          DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
          ParallelScatterZipCreator parallelScatterZipCreator1 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, defaultBackingStoreSupplier0);
          parallelScatterZipCreator0.createCallable((ZipArchiveEntryRequestSupplier) null);
          ZipArchiveEntry zipArchiveEntry0 = null;
          try {
            zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$1");
            fail("Expecting exception: NoClassDefFoundError");
          
          } catch(NoClassDefFoundError e) {
             //
             // org/apache/commons/io/file/attribute/FileTimes
             //
             verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 9, 22L, timeUnit0, linkedBlockingQueue0, threadFactory0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      JarEntry jarEntry0 = null;
      try {
        jarEntry0 = new JarEntry((ZipEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor(0, (-2337), 0, timeUnit0, (BlockingQueue<Runnable>) null, threadFactory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0);
      parallelScatterZipCreator0.writeTo((ZipArchiveOutputStream) null);
      parallelScatterZipCreator0.getStatisticsMessage();
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread();
      scheduledThreadPoolExecutor0.remove(mockThread0);
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@139d7846 rejected from java.util.concurrent.ScheduledThreadPoolExecutor@223ee370[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$AbortPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      Callable<OpenOption> callable0 = (Callable<OpenOption>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      parallelScatterZipCreator0.submit(callable0);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Q");
      JarEntry jarEntry0 = new JarEntry(zipArchiveEntry0);
      JarEntry jarEntry1 = new JarEntry(jarEntry0);
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) jarEntry1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
          Callable<OpenOption> callable0 = (Callable<OpenOption>) mock(Callable.class, new ViolatedAssumptionAnswer());
          doReturn((Object) null).when(callable0).call();
          parallelScatterZipCreator0.submit(callable0);
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
          parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
          ZipArchiveOutputStream zipArchiveOutputStream0 = null;
          try {
            zipArchiveOutputStream0 = new ZipArchiveOutputStream((File) null, 695L);
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
