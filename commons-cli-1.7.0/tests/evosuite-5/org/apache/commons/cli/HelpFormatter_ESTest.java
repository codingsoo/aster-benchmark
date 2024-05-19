
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      helpFormatter0.setDescPadding(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      Object[] objectArray0 = new Object[9];
      helpFormatter0.rtrim("");
      helpFormatter0.getDescPadding();
      objectArray0[0] = (Object) stringBuffer0;
      objectArray0[1] = (Object) "usage: ";
      objectArray0[2] = (Object) " ";
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) stringBuffer0;
      objectArray0[5] = (Object) stringWriter0;
      objectArray0[6] = (Object) null;
      objectArray0[7] = (Object) null;
      objectArray0[8] = (Object) null;
      // Undeclared exception!
      try { 
        mockPrintWriter0.printf((String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 2382;
      Options options0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(2382, "org.apache.commons.cli.ParseException", (String) null, (Options) null, "NG|mzrKYNcteFAV#>", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("usage: ");
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-2769), 1268, ",R");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter(1);
      Object object0 = new Object();
      stringWriter0.flush();
      Options options0 = new Options();
      helpFormatter0.setSyntaxPrefix("");
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.setLeftPadding(1925);
      helpFormatter0.setNewLine("}P!v'#7|:<:j|2eQhf");
      helpFormatter0.rtrim("--");
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter1.getLongOptSeparator();
      helpFormatter1.setOptPrefix("jH`[");
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos("org.apache.commons.cli.HelpFormatter$OptionComparator", 1, (-1834));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setSyntaxPrefix("JEcG-nvbCS");
      MockFile mockFile0 = new MockFile("-", "org.apache.commons.cli.HelpFormatter$OptionComparator");
      MockFile mockFile1 = new MockFile(mockFile0, "arg");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "JEcG-nvbCS");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, true);
      // Undeclared exception!
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 0, "X,Wz|,#Rz0");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.commons.cli.HelpFormatter$1");
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) mockPrintWriter0;
      objectArray0[1] = (Object) "org.apache.commons.cli.HelpFormatter$1";
      objectArray0[2] = (Object) "org.apache.commons.cli.HelpFormatter$1";
      objectArray0[3] = (Object) helpFormatter0;
      objectArray0[4] = (Object) "l}T]N9@lbsZB2";
      objectArray0[5] = (Object) helpFormatter0;
      objectArray0[6] = (Object) helpFormatter0;
      Object object0 = new Object();
      objectArray0[7] = object0;
      mockPrintWriter0.format("l}T]N9@lbsZB2", objectArray0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-560), "org.apache.commons.cli.HelpFormatter$1", "", options0, (-560), 74, "org.apache.commons.cli.HelpFormatter$1", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("printWriter", options0, true);
      options0.getOptions();
      options0.getOptionGroups();
      helpFormatter0.setNewLine((String) null);
      helpFormatter0.printHelp("iD", "D@+syj[1ZVy='+`#E", options0, "'cB6j");
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.getNewLine();
      helpFormatter0.printHelp("-", options0);
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.getLongOptPrefix();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("]", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append('|');
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      char[] charArray0 = new char[6];
      charArray0[0] = '|';
      charArray0[1] = '|';
      charArray0[2] = 'H';
      charArray0[3] = '|';
      charArray0[4] = '|';
      charArray0[5] = '|';
      mockPrintWriter0.write(charArray0, 3, 1);
      mockPrintWriter1.print("usage: ");
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(mockPrintWriter1, (-3107), options0, (-3107), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile("-", "--");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      mockPrintWriter0.println((float) 74);
      String string0 = "65>h";
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 10, "65>h");
      Options options0 = new Options();
      options0.helpOptions();
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 2258, "eyZ12XqZA#~&c", options0);
      helpFormatter0.setWidth((-2148));
      int int0 = 61;
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 0, "65>h", "'#QkuH'mcX&4oe=K", (Options) null, 0, 61, "65>h", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      String string0 = "n<3jZ";
      String string1 = "<}G]ju~@8+lHJ";
      Options options0 = new Options();
      options0.helpOptions();
      options0.hasLongOption("n<3jZ");
      options0.hasShortOption("--");
      boolean boolean0 = true;
      // Undeclared exception!
      helpFormatter0.printHelp(0, "n<3jZ", "<}G]ju~@8+lHJ", options0, "<}G]ju~@8+lHJ", true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("arg");
      helpFormatter0.defaultLeftPad = (-1);
      stringBuffer0.append((-943.7156F));
      helpFormatter0.renderWrappedText(stringBuffer0, (-1), 593, "");
      helpFormatter0.setWidth(0);
      helpFormatter0.setArgName("");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("}bNE@");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      Options options0 = new Options();
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-1), "XFrcc+'SDp!,mH!@j", "XFrcc+'SDp!,mH!@j", options0, 0, 9, "");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp(" :: ", "", options0, (String) null, false);
      helpFormatter0.setOptPrefix("0w^=/@}~XAO");
      helpFormatter0.setArgName("");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("4{,;S[0?i3", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)44;
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-127);
      byteArray0[5] = (byte)2;
      mockFileOutputStream0.write(byteArray0);
      PrintWriter printWriter0 = mockPrintWriter0.append('N');
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0, true);
      mockPrintWriter1.flush();
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter1, 1213, "");
      helpFormatter0.printHelp("4{,;S[0?i3", options0);
      helpFormatter0.setOptPrefix("");
      helpFormatter0.printHelp("F", options0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) null, 46, 46, "[ Options: [ short ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultArgName = null;
      int int0 = (-3836);
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-3836));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      String string0 = "G=3q~CQJ-";
      Options options0 = new Options();
      helpFormatter0.printHelp("G=3q~CQJ-", options0, false);
      helpFormatter0.setLongOptSeparator("G=3q~CQJ-");
      helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      helpFormatter0.setWidth((-1715));
      String string1 = "NO_ARGS_ALLOWED";
      helpFormatter_Builder1.setShowDeprecated(false);
      int int0 = 0;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("G=3q~CQJ-", "NO_ARGS_ALLOWED", options0, "", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "]";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("]");
      String string1 = helpFormatter0.defaultNewLine;
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "\n");
      Options options0 = new Options();
      Locale locale0 = Locale.ENGLISH;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) options0;
      objectArray0[1] = (Object) mockPrintWriter0;
      objectArray0[2] = (Object) options0;
      objectArray0[3] = (Object) options0;
      objectArray0[4] = (Object) "\n";
      objectArray0[5] = (Object) printWriter0;
      objectArray0[6] = (Object) "]";
      mockPrintWriter0.format(locale0, "usage: ", objectArray0);
      helpFormatter0.printOptions(printWriter0, 0, options0, 3873, 0);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-2896), "6!YR");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("usage: ", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "\n");
      int int0 = (-1706);
      String string0 = "";
      Options options0 = new Options();
      String string1 = "Deprecated";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, (-1706), "", "", options0, (-1706), (-1706), "Deprecated", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      helpFormatter0.setWidth(0);
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp("org.apache.commons.cli.Converter", options0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.get();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      StringWriter stringWriter0 = new StringWriter(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, false);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) helpFormatter_Builder0;
      objectArray0[1] = (Object) mockPrintWriter0;
      objectArray0[2] = (Object) stringWriter0;
      objectArray0[3] = (Object) helpFormatter_Builder1;
      objectArray0[4] = (Object) helpFormatter_Builder1;
      Object object0 = new Object();
      objectArray0[5] = object0;
      objectArray0[6] = (Object) stringWriter0;
      objectArray0[7] = (Object) helpFormatter_Builder1;
      PrintWriter printWriter0 = mockPrintWriter1.format("[Deprecated]", objectArray0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(printWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      StringBuffer stringBuffer0 = new StringBuffer("arg");
      Options options0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 0, (Options) null, 1, 0);
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
      helpFormatter0.getOptPrefix();
      int int0 = 0;
      StringWriter stringWriter0 = new StringWriter(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      helpFormatter0.defaultDescPad = 0;
      stringWriter0.close();
      Options options0 = new Options();
      Options options1 = new Options();
      options0.addOptions(options1);
      helpFormatter0.printOptions(mockPrintWriter0, 0, options0, 795, 99);
      helpFormatter0.rtrim("-");
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      boolean boolean0 = false;
      helpFormatter_Builder1.setShowDeprecated(false);
      // Undeclared exception!
      try { 
        mockPrintWriter0.write("--", 74, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = (-1563);
      helpFormatter0.defaultLeftPad = (-1563);
      helpFormatter0.setLeftPadding((-4780));
      helpFormatter0.setDescPadding((-1563));
      Options options0 = new Options();
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderWrappedText(stringBuffer0, 2552, (-4780), "XBA!&c6gp4");
      String string0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("XBA!&c6gp4", "XBA!&c6gp4", options0, (String) null, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(24, "", "", options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("`4TCL?");
      Options options0 = new Options();
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 220, "`4TCL?", "CIVTSsab!A!:- ^2myP", options0, 220, 220, "", true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      Options options0 = new Options();
      StringBuffer stringBuffer1 = helpFormatter1.renderOptions(stringBuffer0, 0, options0, 2, 0);
      StringBuffer stringBuffer2 = helpFormatter0.renderWrappedText(stringBuffer1, 1, 0, "usage: ");
      helpFormatter0.renderOptions(stringBuffer2, 1163, options0, 0, 295);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.createPadding(0);
      int int0 = 3377;
      String string0 = "aEs";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("[", "D!bX*|8", (Options) null, "{-h/<]'*TA", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = ":;z$]y_]?1if)Q";
      StringWriter stringWriter0 = new StringWriter(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
      Options options0 = new Options();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-1812), ":;z$]y_]?1if)Q", ":;z$]y_]?1if)Q", options0, 2643, 0, "arg", true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter0.setArgName(" ");
      int int0 = 695;
      File file0 = MockFile.createTempFile("NkQ%b*4!jhe~ktVgBJ", "usage: ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "NkQ%b*4!jhe~ktVgBJ";
      objectArray0[1] = (Object) helpFormatter0;
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) "NkQ%b*4!jhe~ktVgBJ";
      PrintWriter printWriter0 = mockPrintWriter0.printf("--", objectArray0);
      helpFormatter_Builder1.setPrintWriter(printWriter0);
      helpFormatter0.createPadding(695);
      helpFormatter0.createPadding(0);
      helpFormatter0.setSyntaxPrefix("5c");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "\n");
      char[] charArray0 = new char[9];
      charArray0[0] = 'g';
      charArray0[1] = ']';
      charArray0[2] = 's';
      charArray0[3] = 'J';
      charArray0[4] = 'f';
      charArray0[5] = '(';
      charArray0[6] = '/';
      charArray0[7] = 'R';
      charArray0[8] = '(';
      // Undeclared exception!
      try { 
        stringBuffer0.append(charArray0, 74, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLeftPadding();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 3;
      File file0 = MockFile.createTempFile("EE8V|OE/z/1EL", "j7[{#9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) file0;
      objectArray0[1] = (Object) "EE8V|OE/z/1EL";
      PrintStream printStream0 = mockPrintStream0.format("-", objectArray0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, true);
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 0, "EE8V|OE/z/1EL", "FV4$}+|!Rk", options0, 0, 2, "FV4$}+|!Rk");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setDescPadding((-1214));
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
  public void test29()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.defaultLeftPad = 1679;
      helpFormatter0.setDescPadding(1513);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(filterOutputStream0, false);
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 0, (String) null, (Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      Options options0 = new Options();
      helpFormatter0.renderOptions(stringBuffer0, 74, options0, 74, 74);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderWrappedText(stringBuffer0, 0, 0, "");
      helpFormatter0.findWrapPos("org.apache.commons.cli.HelpFormatter$Builder", 44, 21);
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.findWrapPos("org.apache.commons.cli.HelpFormatter$Builder", 21, 0);
      helpFormatter0.getNewLine();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, false);
      int int0 = 0;
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 0, (String) null, (String) null, options0, 0, (-2000), (String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.defaultArgName = null;
      helpFormatter0.setLeftPadding((-197));
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.getLeftPadding();
      helpFormatter0.setDescPadding(0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-197), (String) null, "HHd;G", options0, "--", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "";
      Options options0 = new Options();
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
  public void test35()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('q');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "arg");
      StringBuffer stringBuffer0 = stringWriter2.getBuffer();
      stringWriter0.flush();
      stringWriter1.close();
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, (-1835), (-1835), "2v.c");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      boolean boolean0 = true;
      helpFormatter0.printHelp("HA$]b)Y*", "?4<w|'X}-", options0, "", true);
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("", "-");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // -
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = null;
      helpFormatter0.setNewLine((String) null);
      String string1 = "";
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) null, 32, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getArgName();
      helpFormatter0.createPadding(170);
      Options options0 = new Options();
      helpFormatter0.printHelp("arg", options0);
      helpFormatter0.getOptPrefix();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "";
      Options options0 = new Options();
      options0.hasOption("\n");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "", options0, "", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(74);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(objectOutputStream0);
      mockPrintWriter0.close();
      Options options0 = new Options();
      Options options1 = new Options();
      Options options2 = options0.addOptions(options1);
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 671, (String) null, options0);
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter0.setLongOptPrefix((String) null);
      helpFormatter0.printHelp("The addValue method is not intended for client use. Subclasses should use the processValue method instead.", "#s1X\"zZ!$aOr", options2, "]");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.commons.cli.Converter");
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) null);
      Options options0 = new Options();
      helpFormatter0.printHelp(printWriter0, 509, "org.apache.commons.cli.Option$Builder", "org.apache.commons.cli.Converter", options0, 0, 0, ": ", true);
      helpFormatter0.printHelp("org.apache.commons.cli.Converter", "org.apache.commons.cli.Option$Builder", options0, " | ", false);
      helpFormatter0.getDescPadding();
      helpFormatter0.setNewLine("!!");
      helpFormatter0.getLongOptSeparator();
      Options options1 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(mockPrintWriter0, (-121), options1, (-121), 3);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      Locale locale0 = Locale.ROOT;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) byteArrayOutputStream0;
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) byteArrayOutputStream0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) helpFormatter0;
      PrintWriter printWriter0 = mockPrintWriter1.printf(locale0, "usage: ", objectArray0);
      MockPrintWriter mockPrintWriter2 = new MockPrintWriter(printWriter0);
      // Undeclared exception!
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter2, 0, "*R`$x(j0m bLmj");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.close();
      stringWriter0.append('w');
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      int int0 = 0;
      String string0 = "4lk)";
      // Undeclared exception!
      helpFormatter0.renderWrappedText(stringBuffer0, 0, 0, "4lk)");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp(74, "Ox->M\f#+h#ioo$._~X", "87OsRQ)g2kJz", options0, "-", true);
      helpFormatter0.defaultArgName = ") ";
      helpFormatter0.setOptPrefix("D1`;tJ");
      helpFormatter0.defaultWidth = 1110;
      helpFormatter0.getOptionComparator();
      helpFormatter0.getOptionComparator();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptPrefix("_U vM7Y:u\"L*.Fy<wp>");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("arg");
      PrintWriter printWriter0 = mockPrintWriter0.append('r');
      Options options0 = new Options();
      helpFormatter0.printUsage(printWriter0, 826, ".n;4qED", options0);
      helpFormatter0.printHelp(826, ".n;4qED", "ksFR<p1WV 0^4JH", options0, ".n;4qED");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getNewLine();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) null, (-1760), "yd+/&;`]wm:J)%SVmr5", options0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLongOptPrefix();
      MockFile mockFile0 = new MockFile("");
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, true);
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter_Builder0.get();
      helpFormatter0.rtrim("");
      // Undeclared exception!
      try { 
        mockPrintWriter0.append((CharSequence) "", (-2326), (-2326));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      // Undeclared exception!
      helpFormatter0.printWrapped((PrintWriter) null, 0, 0, "Cannot add value, list full.");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      PrintWriter printWriter0 = null;
      int int0 = 0;
      Options options0 = new Options();
      int int1 = 3531;
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((PrintWriter) null, 0, options0, 0, 3531);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("b D|OZxcLF");
      helpFormatter0.getOptPrefix();
      Options options0 = new Options();
      helpFormatter0.printHelp("-", options0, false);
      helpFormatter0.setWidth(0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = ">IA1{Ko2F";
      Options options0 = new Options();
      helpFormatter0.printHelp(">IA1{Ko2F", ">IA1{Ko2F", options0, ">IA1{Ko2F", false);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "arg");
      int int0 = 3383;
      StringBuffer stringBuffer1 = helpFormatter0.renderOptions(stringBuffer0, 3383, options0, 3383, 3383);
      Options options1 = null;
      char[] charArray0 = new char[4];
      charArray0[0] = 'w';
      charArray0[1] = 'M';
      charArray0[2] = '|';
      charArray0[3] = 'F';
      // Undeclared exception!
      try { 
        stringBuffer1.append(charArray0, 3, 74);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.createPadding(620);
      helpFormatter0.getWidth();
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      File file0 = MockFile.createTempFile("EEE MMM dd HH:mm:ss zzz yyyy", "6aUU'yDa|{V[Vx]B*>");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      helpFormatter_Builder2.get();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("The option '%s' was specified but an option from this group has already been selected: '%s'");
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mockPrintStream0;
      objectArray0[1] = (Object) "-";
      PrintStream printStream0 = mockPrintStream1.format("-", objectArray0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, false);
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "Az).bJ";
      helpFormatter0.setLongOptSeparator("Az).bJ");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "", options0, "Az).bJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.optionComparator = comparator0;
      helpFormatter0.setNewLine("");
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, 2335, 2335, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "^Mv7@RkX`";
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("^Mv7@RkX`");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      mockPrintWriter0.print(0L);
      int int0 = 3;
      String string1 = "";
      mockPrintWriter0.print((float) 74);
      String string2 = "8~qR).";
      helpFormatter0.defaultSyntaxPrefix = "r4dB#3n54";
      Options options0 = new Options();
      options0.helpOptions();
      int int1 = (-2426);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-2426), "8~qR).", "Cv2BB{(%@gu6#qwp", options0, "", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) null, 1065, "vC", ")^q7?epC|P.uLl", options0, 1065, 416, " :: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "<";
      helpFormatter0.defaultLongOptPrefix = "<";
      int int0 = 0;
      String string1 = "Ee-|9<~D],L'9C}z";
      Options options0 = null;
      String string2 = "4";
      helpFormatter0.defaultOptPrefix = "4";
      helpFormatter0.setOptPrefix((String) null);
      helpFormatter0.setLeftPadding(0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("Ee-|9<~D],L'9C}z", "1Am5jFb-", (Options) null, "   ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "arg");
      int int0 = 4190;
      int int1 = (-949);
      helpFormatter0.renderWrappedText(stringBuffer0, 4190, (-949), "");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, (-949), options0, (-949), (-949));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = null;
      helpFormatter0.setOptPrefix((String) null);
      int int0 = 1783;
      String string1 = "org.apache.commons.cli.DeprecatedAttributes";
      helpFormatter0.setNewLine("org.apache.commons.cli.DeprecatedAttributes");
      Options options0 = null;
      String string2 = "Z~-igFHdjt[|";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(1783, (String) null, (String) null, (Options) null, "Z~-igFHdjt[|", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      boolean boolean0 = false;
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      int int0 = (-465);
      helpFormatter0.setWidth((-465));
      helpFormatter0.getSyntaxPrefix();
      StringBuffer stringBuffer0 = new StringBuffer("");
      // Undeclared exception!
      try { 
        stringBuffer0.insert(1352, 697.9147);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1352
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      boolean boolean0 = false;
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder1.get();
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderWrappedText(stringBuffer0, 734, 2523, "usage: ");
      int int0 = (-127);
      Options options0 = new Options();
      String string0 = "";
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("-", "EEE MMM dd HH:mm:ss zzz yyyy");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // EEE MMM dd HH:mm:ss zzz yyyy
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "usage: ";
      helpFormatter0.setArgName("usage: ");
      helpFormatter0.setSyntaxPrefix("h$uv6tu@|=%J88{)a2^");
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter(" ", "h$uv6tu@|=%J88{)a2^");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // h$uv6tu@|=%J88{)a2^
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setNewLine("Option ");
      int int0 = 0;
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "9qmXQ,gRPn,.=GI", "!z tgTO4n0IvUTXa", options0, "!z tgTO4n0IvUTXa");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter(74);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
      mockPrintWriter0.println((double) 1);
      int int0 = (-35);
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-35), "l:S&QYh7hi{t%");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "@6|";
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "3Pxd", "3Pxd", options0, "");
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("usage: ");
      PrintWriter printWriter0 = mockPrintWriter0.format("usage: ", (Object[]) null);
      mockPrintWriter0.write(" ", 0, 0);
      String string0 = "";
      helpFormatter0.printWrapped(printWriter0, (-1399), (-1399), "");
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      StringWriter stringWriter0 = new StringWriter();
      helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      int int0 = 1787;
      // Undeclared exception!
      try { 
        stringWriter0.write("", 0, 1787);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setArgName("org.apache.commons.cli.AlreadySelectedException");
      helpFormatter0.rtrim("_`--rY>QSHu]Ys9R");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = (-3156);
      String string0 = "org.apache.commons.cli.HelpFormatter";
      Options options0 = new Options();
      options0.toString();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-3156), "org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", options0, "bgZyix1d$y");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 10;
      StringBuffer stringBuffer0 = new StringBuffer(10);
      char[] charArray0 = new char[5];
      charArray0[0] = '7';
      helpFormatter0.setDescPadding(0);
      charArray0[1] = '^';
      // Undeclared exception!
      try { 
        stringBuffer0.setCharAt(2374, '7');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "hwOV4`f0[7b*gttDb";
      String string1 = "";
      Options options0 = new Options();
      helpFormatter0.printHelp("hwOV4`f0[7b*gttDb", "", options0, (String) null);
      helpFormatter0.rtrim((String) null);
      MockFile mockFile0 = new MockFile("");
      MockFile mockFile1 = new MockFile(mockFile0, "org.apache.commons.cli.HelpFormatter$Builder");
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter(mockFile1, ":.}");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // :.}
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultOptPrefix = "";
      String string0 = "org.apache.commons.cli.Options";
      helpFormatter0.setLongOptSeparator("org.apache.commons.cli.Options");
      String string1 = null;
      Options options0 = new Options();
      options0.getMatchingOptions("");
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.optionComparator = comparator0;
      options0.getOptionGroups();
      // Undeclared exception!
      try { 
        options0.addOption("\n", "org.apache.commons.cli.Options");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '
         // '.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("printWriter", options0, true);
      options0.getOptions();
      options0.getOptionGroups();
      helpFormatter0.setNewLine((String) null);
      helpFormatter0.printHelp("iD", "D@+syj[1ZVy='+`#E", options0, "'cB6j");
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.printHelp("-", options0);
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.getLongOptPrefix();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("]", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append('|');
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      char[] charArray0 = new char[13];
      charArray0[0] = '|';
      charArray0[1] = '|';
      charArray0[2] = 'H';
      charArray0[3] = '|';
      charArray0[4] = '|';
      charArray0[5] = '|';
      mockPrintWriter0.write(charArray0, 3, 1);
      mockPrintWriter1.print("usage: ");
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(mockPrintWriter1, (-1454), options0, (-1454), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setArgName("");
      helpFormatter0.setOptPrefix("");
      helpFormatter0.setArgName("");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(2, "", "", options0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      HelpFormatter.builder();
      String string0 = "lmt&";
      MockFile mockFile0 = new MockFile("lmt&");
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter(mockFile0, "lmt&");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // lmt&
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.get();
      String string0 = "MNs_0PXnFc)9LghZ";
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("usage: ", "MNs_0PXnFc)9LghZ");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // MNs_0PXnFc)9LghZ
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, false);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "--");
      Object object0 = new Object();
      mockPrintWriter0.flush();
      stringWriter0.flush();
      mockPrintWriter0.print(object0);
      int int0 = 0;
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printUsage(printWriter0, 0, "", options0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      String string0 = null;
      helpFormatter0.setArgName("tlb.U");
      Options options0 = new Options();
      MockPrintStream mockPrintStream0 = new MockPrintStream("-");
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) mockPrintStream0;
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) "w#@$nFM[";
      Options options1 = new Options();
      options0.addOptions(options1);
      objectArray0[3] = (Object) mockPrintStream0;
      objectArray0[4] = (Object) null;
      PrintStream printStream0 = mockPrintStream0.printf("w#@$nFM[", objectArray0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, false);
      PrintWriter printWriter0 = mockPrintWriter0.format("usage: ", objectArray0);
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(printWriter0, 0, (Options) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }
}
