
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


package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) null;
      objectArray0[3] = (Object) helpFormatter_Builder0;
      objectArray0[4] = (Object) helpFormatter_Builder0;
      int int0 = (-2853);
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer(13);
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, (-2853), (Options) null, 3, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Options options0 = new Options();
      helpFormatter0.printHelp("org.apache.commons.cli.DeprecatedAttributes", options0, true);
      helpFormatter0.defaultWidth = 3;
      helpFormatter0.setSyntaxPrefix("");
      helpFormatter0.getLeftPadding();
      helpFormatter0.getOptPrefix();
      StringWriter stringWriter0 = new StringWriter(3);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      PrintWriter printWriter0 = mockPrintWriter0.printf("", objectArray0);
      helpFormatter0.printHelp(printWriter0, 2, "1[04u:1Mh>J=L", "", options0, 3, 3, "", true);
      helpFormatter0.printHelp(printWriter0, 3, " ", "", options0, 92, 3, "", true);
      helpFormatter0.getDescPadding();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      boolean boolean0 = true;
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      byteArrayOutputStream0.close();
      helpFormatter_Builder2.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 0, 0, "");
      helpFormatter0.setDescPadding((-606));
      HelpFormatter helpFormatter1 = helpFormatter_Builder2.get();
      helpFormatter0.getDescPadding();
      helpFormatter_Builder1.setShowDeprecated(true);
      String string0 = "]";
      helpFormatter0.setLongOptSeparator("arg");
      Options options0 = new Options();
      String string1 = " [ARG]";
      // Undeclared exception!
      helpFormatter1.printUsage((PrintWriter) mockPrintWriter0, 1, "GMW!s_YD|");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultSyntaxPrefix = "Qh8hi\"";
      helpFormatter0.defaultWidth = 0;
      helpFormatter0.defaultSyntaxPrefix = "j-q|oM_Wy4{ .\"ma";
      helpFormatter0.setOptPrefix("org.apache.commons.cli.DeprecatedAttributes");
      helpFormatter0.setWidth((-1783));
      helpFormatter0.getLongOptPrefix();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-ujs");
      Locale locale0 = Locale.KOREAN;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "j-q|oM_Wy4{ .\"ma";
      Object object0 = new Object();
      objectArray0[1] = object0;
      Object object1 = new Object();
      objectArray0[2] = object1;
      objectArray0[3] = (Object) "Qh8hi\"";
      objectArray0[4] = (Object) "j-q|oM_Wy4{ .\"ma";
      objectArray0[5] = (Object) "j-q|oM_Wy4{ .\"ma";
      objectArray0[6] = (Object) helpFormatter0;
      PrintWriter printWriter0 = mockPrintWriter0.format(locale0, "--", objectArray0);
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printUsage(printWriter0, 0, "-ujs", options0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultNewLine = "8>u+)%;yL Dyu&i+BS";
      String string0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos((String) null, 39, 2355);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setLeftPadding(0);
      helpFormatter0.defaultWidth = 2843;
      helpFormatter0.getWidth();
      helpFormatter0.getDescPadding();
      Options options0 = new Options();
      options0.hasShortOption("d1HnQf!94<0qN");
      helpFormatter0.printHelp("{~1SRE:(]By~", "{~1SRE:(]By~", options0, "H4'CHHVG:-uL");
      helpFormatter0.defaultNewLine = "H4'CHHVG:-uL";
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter0.findWrapPos("{~1SRE:(]By~", 3, 372);
      helpFormatter0.getOptPrefix();
      helpFormatter0.setArgName("{~1SRE:(]By~");
      helpFormatter0.getLeftPadding();
      helpFormatter_Builder0.get();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      int int0 = 7510;
      String string0 = "";
      String string1 = "{s";
      helpFormatter_Builder0.get();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) null, 74, "arg", "", options0, (-1197), (-1688), "DOJ-YU*_-][uu&o}!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      helpFormatter_Builder0.get();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      PrintWriter printWriter0 = mockPrintWriter0.append('!');
      helpFormatter_Builder0.setPrintWriter(printWriter0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintStream0, false);
      mockPrintWriter1.println(false);
      mockPrintWriter1.println('U');
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter1);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter1, 3, (-2926), "usage: ");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer(3);
      Options options0 = new Options();
      StringBuffer stringBuffer1 = helpFormatter0.renderOptions(stringBuffer0, 0, options0, 0, 0);
      StringBuffer stringBuffer2 = helpFormatter0.renderWrappedText(stringBuffer1, 0, 39, "");
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer2, 0, options0, (-2387), 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.findWrapPos("\";SMiYyCW`aX[", 1909, 1909);
      HelpFormatter.builder();
      Options options0 = new Options();
      helpFormatter0.printHelp(74, "\";SMiYyCW`aX[", "\";SMiYyCW`aX[", options0, ")WtAm$bufv", true);
      helpFormatter0.rtrim("The option '%s' was specified but an option from this group has already been selected: '%s'");
      helpFormatter0.getArgName();
      Options options1 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      helpFormatter0.setWidth((-1));
      options1.addOptionGroup(optionGroup0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-1619), "The option '%s' was specified but an option from this group has already been selected: '%s'", "arg", options1, "\";SMiYyCW`aX[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("z97\"0 J", false);
      mockFileOutputStream0.getChannel();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      mockPrintWriter0.checkError();
      helpFormatter0.findWrapPos("z97\"0 J", 3000, 3000);
      mockFileOutputStream0.flush();
      HelpFormatter.builder();
      helpFormatter0.getOptPrefix();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 3000, "A_^ywj'Q9", "org.apache.commons.cli.OptionGroup", options0, 1, (-1501), "org.apache.commons.cli.ParseException", false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp(2256, "F~q", "yvC2 ^(", options0, "");
      helpFormatter0.setLongOptPrefix("qLV)?u}wl+)");
      helpFormatter0.setSyntaxPrefix((String) null);
      helpFormatter0.setLongOptPrefix("m~JUC|");
      helpFormatter0.setWidth((-460));
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.setSyntaxPrefix("");
      helpFormatter0.getWidth();
      helpFormatter0.setNewLine((String) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "[WPSNta";
      helpFormatter0.defaultSyntaxPrefix = "[WPSNta";
      int int0 = 0;
      helpFormatter0.createPadding(0);
      String string1 = "";
      String string2 = "t'L}kR";
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("[WPSNta", "t'L}kR");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // t'L}kR
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.setNewLine("");
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.getLeftPadding();
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.setShowDeprecated(false);
      StringWriter stringWriter0 = new StringWriter(1);
      StringWriter stringWriter1 = stringWriter0.append('5');
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter1);
      // Undeclared exception!
      try { 
        helpFormatter1.printHelp((PrintWriter) mockPrintWriter0, 269, "mb4]thC", "", (Options) null, 74, 973, "V5a|7YD{}bslbL", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      Options options0 = new Options();
      options0.getOptions();
      options0.hasShortOption("kt|&tF{O6>lv_&na");
      helpFormatter0.printHelp("6^F%^Fum{ f?`n$", options0, true);
      helpFormatter0.optionComparator = comparator0;
      String string0 = "";
      Options options1 = new Options();
      options1.hasLongOption("arg");
      helpFormatter0.optionComparator = comparator0;
      boolean boolean0 = true;
      PrintWriter printWriter0 = null;
      int int0 = 10;
      helpFormatter0.defaultLongOptPrefix = "";
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) null, 10, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.get();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("9~2&`M^QYYq`WZ", (Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultArgName = "";
      Options options0 = new Options();
      options0.hasShortOption("");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-2), "!v?_r]~r-sn@QS'^#p", "wxcp", options0, "!v?_r]~r-sn@QS'^#p", true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter0.defaultSyntaxPrefix = null;
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter_Builder1.get();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(0, "--", "arg", options0, "arg");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "?ozpOSW";
      helpFormatter0.rtrim("?ozpOSW");
      MockFile mockFile0 = new MockFile("\n");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      PrintWriter printWriter0 = mockPrintWriter0.append('f');
      String string1 = "";
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage(printWriter0, (-2), "", options0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Option option0 = new Option("LB", (String) null, true, "]+");
      options0.addOption(option0);
      helpFormatter0.printHelp("G;Kfb", "]+", options0, "]+");
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      // Undeclared exception!
      try { 
        helpFormatter_Builder0.setPrintWriter((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // printWriter
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = null;
      int int0 = 1;
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText((StringBuffer) null, 1, 1, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      PrintWriter printWriter0 = null;
      int int0 = 32;
      boolean boolean0 = true;
      helpFormatter_Builder0.setShowDeprecated(true);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) null, 32, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setDescPadding((-1302));
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("S}O", "]X~Y3Q*P2 jnH", options0, "S}O");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.cli.ParseException");
      boolean boolean0 = true;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, true);
      char[] charArray0 = new char[0];
      mockPrintWriter0.println(charArray0);
      Locale locale0 = Locale.ITALIAN;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) mockPrintWriter0;
      objectArray0[1] = (Object) mockFileOutputStream0;
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      objectArray0[2] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.format(locale0, "org.apache.commons.cli.ParseException", objectArray0);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      helpFormatter_Builder1.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0, true);
      int int0 = 86;
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter1, 86, 86, "HpRCj}`eu");
      String string0 = "RRvu";
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-1350), "RRvu");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) null, (-2433), (-2433), "{>2Z>l3i");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultWidth = 46;
      helpFormatter0.getWidth();
      StringWriter stringWriter0 = new StringWriter(74);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      PrintWriter printWriter0 = mockPrintWriter1.append('1');
      mockPrintWriter1.write((-2));
      char[] charArray0 = new char[0];
      stringWriter0.write(charArray0);
      Options options0 = new Options();
      helpFormatter0.printUsage(printWriter0, 10, "m>j.v.Ge", options0);
      helpFormatter0.setWidth(0);
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.get();
      helpFormatter1.getLongOptPrefix();
      helpFormatter1.setLeftPadding(0);
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      // Undeclared exception!
      helpFormatter1.printWrapped((PrintWriter) mockPrintWriter0, 0, 1063, " ");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = " [ARG]";
      Options options0 = new Options();
      options0.getOptionGroups();
      String string1 = "<";
      helpFormatter0.printHelp(" [ARG]", " [ARG]", options0, "<");
      // Undeclared exception!
      helpFormatter0.printHelp(0, "arg", "arg", options0, "N");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getNewLine();
      String string0 = "org.apache.commons.cli.Option";
      StringBuffer stringBuffer0 = new StringBuffer();
      int int0 = 0;
      int int1 = 0;
      // Undeclared exception!
      helpFormatter0.renderWrappedText(stringBuffer0, 0, 0, "\n");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      int int0 = 0;
      helpFormatter0.setLongOptPrefix((String) null);
      helpFormatter0.setLeftPadding(0);
      helpFormatter0.setSyntaxPrefix((String) null);
      helpFormatter0.setWidth(2408);
      helpFormatter0.getArgName();
      helpFormatter0.setNewLine("D:}");
      String string0 = "";
      String string1 = "`laJK9Ngsh`(5;";
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-");
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) helpFormatter_Builder0;
      objectArray0[3] = (Object) "D:}";
      objectArray0[4] = (Object) "arg";
      PrintWriter printWriter0 = mockPrintWriter0.format("usage: ", objectArray0);
      Options options0 = new Options();
      helpFormatter1.printHelp(printWriter0, 2408, "D:}", "9)GlpO", options0, 74, 1, ":B%8k%\"");
      MockPrintWriter mockPrintWriter1 = null;
      try {
        mockPrintWriter1 = new MockPrintWriter("-", "`laJK9Ngsh`(5;");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // `laJK9Ngsh`(5;
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "";
      helpFormatter0.setArgName("");
      helpFormatter0.getArgName();
      helpFormatter0.getLongOptSeparator();
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, (-469), options0, (-469), (-469));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-226));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "o>qsRM1";
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter0.defaultNewLine = "o>qsRM1";
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.setNewLine("");
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0);
      Locale locale0 = Locale.GERMANY;
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      Object object1 = new Object();
      objectArray0[3] = object1;
      objectArray0[4] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter1.printf(locale0, "usage: ", objectArray0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, 9, "", "", (Options) null, 0, 9, "S EZA<5Jn@@/q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("PPdm.WAe[XNo$2", options0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      helpFormatter0.renderWrappedText(stringBuffer0, 3911, (-3243), "");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter0.defaultNewLine = "${x3LGPljf3j";
      helpFormatter0.defaultLeftPad = 0;
      helpFormatter0.setLongOptSeparator("${x3LGPljf3j");
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.setOptionComparator(comparator0);
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter0.getDescPadding();
      helpFormatter0.getLongOptSeparator();
      String string0 = "w5S+'G??YF$;8<FbXb";
      helpFormatter1.defaultLeftPad = (-178);
      Options options0 = new Options();
      helpFormatter0.defaultDescPad = (-178);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        helpFormatter1.printHelp("w5S+'G??YF$;8<FbXb", "arg", options0, "Cannot add value, list full.", false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim((String) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.getWidth();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      helpFormatter0.renderWrappedText(stringBuffer0, 74, 0, "0wNWR<$c+`Eh+%v^'s");
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("\n", "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // 
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setOptPrefix("");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("#wa&");
      Locale locale0 = Locale.UK;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "#wa&";
      objectArray0[1] = (Object) helpFormatter_Builder0;
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) locale0;
      objectArray0[5] = (Object) "#wa&";
      objectArray0[6] = (Object) helpFormatter_Builder0;
      objectArray0[7] = (Object) "#wa&";
      PrintWriter printWriter0 = mockPrintWriter0.format(locale0, "#wa&", objectArray0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, (-1882), "(\"^|A", "zr*~Ra2\"", options0, 984, 984, "", true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((String) null, options0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.getOptPrefix();
      helpFormatter0.setNewLine("qEwHD|");
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter1 = helpFormatter_Builder1.get();
      helpFormatter_Builder1.setShowDeprecated(true);
      helpFormatter_Builder1.setShowDeprecated(true);
      Options options0 = new Options();
      options0.getRequiredOptions();
      helpFormatter0.printHelp("\n", options0, true);
      helpFormatter1.getLongOptPrefix();
      MockFile mockFile0 = new MockFile("--");
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter(mockFile0, "-");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // -
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      PrintStream printStream0 = mockPrintStream0.append('Q');
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0);
      Options options0 = new Options();
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 9, "", options0);
      MockFile mockFile0 = new MockFile("-", "");
      mockFile0.setLastModified(1830L);
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "3!s`|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "5!(W", options0, "", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      HelpFormatter.builder();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.getDescPadding();
      helpFormatter0.getArgName();
      helpFormatter0.setLongOptPrefix("]");
      Options options0 = new Options();
      boolean boolean0 = false;
      helpFormatter0.printHelp(1768, "i-tJtHjSeoW", "9.:FdJ9U3E]-I`jW", options0, "", false);
      helpFormatter0.printHelp(3677, "_RO", "arg", options0, "!O},oOUs 1+.(!6v");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "]");
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, (-1220), 3, "]");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getDescPadding();
      helpFormatter0.setLongOptPrefix("ckd<&cn{ym/");
      File file0 = MockFile.createTempFile("ckd<&cn{ym/", "d!`");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      mockPrintWriter0.print((long) 1);
      mockPrintWriter0.println("usage: ");
      objectArray0[0] = object0;
      objectArray0[1] = (Object) file0;
      mockPrintWriter0.write("--");
      objectArray0[2] = (Object) mockPrintWriter0;
      Object object1 = new Object();
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 3, "d!`");
      objectArray0[3] = object1;
      objectArray0[4] = (Object) "d!`";
      objectArray0[5] = (Object) "ckd<&cn{ym/";
      PrintWriter printWriter0 = mockPrintWriter0.printf(" ", objectArray0);
      Options options0 = new Options();
      helpFormatter0.printOptions(printWriter0, 3, options0, 3, 3);
      options0.getOption(" ");
      helpFormatter0.getOptionComparator();
      String string0 = "";
      String string1 = "";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "d!`", options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultNewLine = "]";
      helpFormatter0.setArgName("");
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.rtrim("");
      helpFormatter0.setSyntaxPrefix("org.apache.commons.cli.Options");
      helpFormatter0.setWidth(0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      boolean boolean0 = true;
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      byteArrayOutputStream0.close();
      helpFormatter_Builder2.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 0, 0, "");
      helpFormatter0.setDescPadding((-606));
      helpFormatter_Builder2.get();
      helpFormatter0.getDescPadding();
      helpFormatter_Builder1.setShowDeprecated(true);
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos("", 0, (-606));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "";
      Options options0 = new Options();
      int int0 = 0;
      helpFormatter0.setWidth(0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.getOptPrefix();
      MockFile mockFile0 = new MockFile(" ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "-";
      PrintWriter printWriter0 = mockPrintWriter0.format(" ", objectArray0);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped(printWriter0, (-1572), 1636, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "usage: ");
      // Undeclared exception!
      helpFormatter0.renderWrappedText(stringBuffer0, 0, 0, "tR)wz+");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(0, "", "", options0, "G");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter_Builder0.setShowDeprecated(false);
      MockFile mockFile0 = new MockFile("*TJt_]z(LO\"mEr6C", "usage: ");
      MockFile mockFile1 = new MockFile(mockFile0, "-");
      mockFile1.toURL();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile1);
      PrintWriter printWriter0 = mockPrintWriter0.append('F');
      mockFile1.getAbsoluteFile();
      Options options0 = new Options();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter0.printOptions(printWriter0, 0, options0, 625, 625);
      mockFile1.setLastModified(0L);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 625, "|9lcHn$b");
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 625, "usage: ");
      HelpFormatter.builder();
      helpFormatter0.setArgName("--");
      helpFormatter1.createPadding(308);
      HelpFormatter helpFormatter2 = helpFormatter_Builder0.get();
      helpFormatter2.defaultArgName = "usage: ";
      mockFile1.mkdir();
      helpFormatter1.printOptions(mockPrintWriter0, 61, options0, 0, 3);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultSyntaxPrefix = null;
      helpFormatter0.setLongOptPrefix("rV");
      helpFormatter0.setLongOptPrefix("Pxwpe/");
      helpFormatter0.getWidth();
      helpFormatter0.getLongOptSeparator();
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptPrefix("rV");
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.setLeftPadding(74);
      helpFormatter0.setDescPadding(74);
      helpFormatter0.setArgName((String) null);
      HelpFormatter.builder();
      helpFormatter0.setLeftPadding(74);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      stringBuffer0.append((long) 74);
      int int0 = 0;
      Options options0 = new Options();
      helpFormatter0.renderOptions(stringBuffer0, 0, options0, 0, 0);
      String string0 = "[";
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("[", "<");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // <
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("{yAP(l;@Gxs'1d9Q");
      helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.getOptionComparator();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "?\" T2|qxsCz\"fpn42+";
      File file0 = MockFile.createTempFile("?\" T2|qxsCz\"fpn42+", (String) null);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      PrintWriter printWriter0 = mockPrintWriter0.append('?');
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter1, (-1), "?\" T2|qxsCz\"fpn42+");
      mockPrintWriter0.print((Object) helpFormatter0);
      String string1 = "";
      Options options0 = new Options();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, (-1), "", (String) null, options0, (-1), 0, "", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 32;
      Options options0 = new Options();
      options0.hasLongOption("(-");
      options0.getMatchingOptions("");
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) null, 32, "v^CQ|@EC/Q", options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, false);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter1, (-828), "Option ", "Option ", options0, (-828), (-688), "Option ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "";
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter_Builder1.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "F ";
      helpFormatter0.setWidth((-2880));
      try { 
        MockURI.URI("F ");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 1: F 
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      helpFormatter0.setDescPadding(0);
      String string0 = "U";
      Options options0 = new Options();
      options0.getMatchingOptions("usage: ");
      Option option0 = null;
      try {
        option0 = new Option("--", "%c]vk9]19']TFw");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '-'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultLongOptPrefix = "iS%g@G$_6m=";
      helpFormatter0.setLeftPadding(13);
      helpFormatter0.setOptPrefix("cmdLineSyntax not provided");
      helpFormatter0.setLeftPadding((-4490));
      helpFormatter0.getOptPrefix();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = ",9j!4C[cCA4:A";
      String string1 = "r%";
      helpFormatter0.setLongOptSeparator("r%");
      helpFormatter0.setSyntaxPrefix(",9j!4C[cCA4:A");
      helpFormatter0.setArgName("arg");
      int int0 = (-662);
      String string2 = "vaua59=0dr s,*o";
      String string3 = "#.'>*i&NB p";
      Options options0 = new Options();
      options0.helpOptions();
      String string4 = "426#d3V F9Q^c_69c";
      String string5 = "";
      // Undeclared exception!
      try { 
        options0.addOption("", false, " ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder1.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter0.setLeftPadding((-35));
      helpFormatter0.getNewLine();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 1769;
      helpFormatter0.defaultWidth = 1769;
      Options options0 = new Options();
      options0.hasLongOption(" ");
      options0.getOptions();
      helpFormatter0.printHelp("org.apache.commons.cli.OptionGroup", options0, true);
      helpFormatter0.getWidth();
      StringBuffer stringBuffer0 = null;
      int int1 = 5872;
      String string0 = "";
      try { 
        MockURI.URI("arg", " ", "usage: ", 1769, "2g/Yp%zVP", "", " ");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: arg://%20@[usage: ]:17692g/Yp%25zVP?#%20
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setSyntaxPrefix("C:[Cfj13");
      StringBuffer stringBuffer0 = new StringBuffer("-");
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, (-3369), (-3369), "C:[Cfj13");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "#?Eh7>Geu";
      Options options0 = new Options();
      options0.getRequiredOptions();
      boolean boolean0 = false;
      helpFormatter0.printHelp("#?Eh7>Geu", options0, false);
      int int0 = 3;
      helpFormatter0.createPadding(3);
      helpFormatter0.getDescPadding();
      File file0 = MockFile.createTempFile("usage: ", "arg");
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(file0, "-");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // -
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter1.setOptPrefix("[Deprecated]");
      Comparator<Option> comparator0 = helpFormatter1.getOptionComparator();
      helpFormatter1.setOptionComparator(comparator0);
      helpFormatter1.getLeftPadding();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-");
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 3, 46, "-");
      helpFormatter0.getLongOptSeparator();
      Options options0 = new Options();
      helpFormatter0.printHelp(74, "arg", "--", options0, "\n", true);
      // Undeclared exception!
      helpFormatter1.printHelp(1, "org.apache.commons.cli.Option$Builder", "Zwj+(;kJl?x", options0, "org.apache.commons.cli.Option$Builder");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          HelpFormatter helpFormatter0 = new HelpFormatter();
          String string0 = "9.ek=!w%5R";
          helpFormatter0.rtrim("9.ek=!w%5R");
          int int0 = 0;
          helpFormatter0.defaultLeftPad = 0;
          Comparator<Option> comparator0 = helpFormatter0.optionComparator;
          helpFormatter0.setOptionComparator(comparator0);
          helpFormatter0.getLongOptSeparator();
          FileDescriptor fileDescriptor0 = new FileDescriptor();
          MockFileOutputStream mockFileOutputStream0 = null;
          try {
            mockFileOutputStream0 = new MockFileOutputStream(fileDescriptor0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"writeFileDescriptor\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:954)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:245)
             // org.evosuite.runtime.mock.java.io.MockFileOutputStream.<init>(MockFileOutputStream.java:114)
             // sun.reflect.GeneratedConstructorAccessor68.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      String string0 = "WcaHDE";
      File file0 = MockFile.createTempFile("WcaHDE", "WcaHDE");
      try { 
        MockFile.createTempFile("WcaHDE", "WcaHDE", file0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(3, "", "", options0, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setLongOptPrefix("");
      helpFormatter0.defaultArgName = "[";
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.cli.AlreadySelectedException", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      helpFormatter_Builder0.setShowDeprecated(true);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "[");
      mockFileOutputStream0.write(1);
      helpFormatter0.printWrapped(printWriter0, 2843, "");
      HelpFormatter.builder();
      helpFormatter0.setArgName("H8*(g~r0S");
      assertEquals("H8*(g~r0S", helpFormatter0.getArgName());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "[Deprecated]";
      String string1 = "";
      Options options0 = new Options();
      MockFile mockFile0 = new MockFile("arg");
      mockFile0.getCanonicalPath();
      helpFormatter0.setLongOptPrefix("");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      mockPrintWriter0.print((double) 3);
      int int0 = (-2);
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(mockPrintWriter0, (-2), options0, (-2), 74);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.findWrapPos("\";SMiYyCW`aX[", 1909, 1909);
      HelpFormatter.builder();
      Options options0 = new Options();
      helpFormatter0.setWidth(20);
      helpFormatter0.printHelp(96, "\";SMiYyCW`aX[", "\";SMiYyCW`aX[", options0, ")WtAm$bufv", true);
      helpFormatter0.rtrim("The option '%s' was specified but an option from this group has already been selected: '%s'");
      helpFormatter0.getArgName();
      Options options1 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "--");
      helpFormatter0.setWidth((-1));
      helpFormatter0.getWidth();
      options1.addOptionGroup(optionGroup0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-1619), "The option '%s' was specified but an option from this group has already been selected: '%s'", "arg", options1, "\";SMiYyCW`aX[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = helpFormatter0.getSyntaxPrefix();
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("usage: ", string0);
      assertEquals("-", helpFormatter0.getOptPrefix());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("\n");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "arg");
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-876), (-876), "");
      mockPrintWriter0.print("g");
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter1, 9, 9, "rx_E8IbvfP;T[");
      StringBuffer stringBuffer0 = new StringBuffer("arg");
      stringBuffer0.trimToSize();
      Options options0 = new Options();
      helpFormatter0.printHelp(9, ": ", "", options0, "-", false);
      options0.addRequiredOption("arg", "", false, "rx_E8IbvfP;T[");
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter0.renderOptions(stringBuffer0, 9, options0, 74, 74);
      assertEquals("arg\n -arg,--\n rx_E8Ibv\n fP;T[", stringBuffer0.toString());
      
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.setSyntaxPrefix(";42oo`vS(15~?3");
      String string0 = helpFormatter0.getOptPrefix();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1476);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedOutputStream0, false);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) bufferedOutputStream0;
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) "H";
      objectArray0[3] = (Object) "H";
      objectArray0[4] = (Object) null;
      objectArray0[5] = (Object) helpFormatter_Builder0;
      objectArray0[6] = (Object) bufferedOutputStream0;
      Object object0 = new Object();
      objectArray0[7] = object0;
      objectArray0[8] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.format("H", objectArray0);
      mockPrintWriter0.println("");
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      helpFormatter_Builder1.setShowDeprecated(true);
      helpFormatter_Builder1.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setOptionComparator((Comparator<Option>) null);
      assertEquals("arg", helpFormatter0.getArgName());
      
      helpFormatter0.defaultArgName = "";
      Options options0 = new Options();
      helpFormatter0.printHelp("H", "", options0, "<u[!KW$A~}57Qg", false);
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      HelpFormatter.builder();
      helpFormatter0.findWrapPos("i`:)", 74, 74);
      helpFormatter1.setSyntaxPrefix("i`:)");
      assertEquals(1, helpFormatter1.getLeftPadding());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setOptPrefix("a7B[)%<H'x");
      helpFormatter0.setSyntaxPrefix(", ");
      helpFormatter0.setWidth(811);
      helpFormatter0.createPadding(1751);
      helpFormatter0.getLeftPadding();
      MockFile mockFile0 = new MockFile("a7B[)%<H'x", "\n");
      MockFile.createTempFile("Cg/1]PZ1", "", (File) mockFile0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.lookup(linkedList0, linkedList1);
      Options options0 = new Options();
      Object[] objectArray0 = new Object[1];
      linkedList1.add((Locale) null);
      helpFormatter0.setWidth(0);
      assertEquals("a7B[)%<H'x", helpFormatter0.getOptPrefix());
  }
}
