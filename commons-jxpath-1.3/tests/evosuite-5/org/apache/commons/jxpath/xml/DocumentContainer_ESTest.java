
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


package org.apache.commons.jxpath.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.net.URI;
import java.net.URL;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.JDOMParser;
import org.apache.commons.jxpath.xml.XMLParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DocumentContainer_ESTest extends DocumentContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "; ");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)50;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)31;
      byteArray0[6] = (byte) (-21);
      byteArray0[7] = (byte)99;
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(byteArrayInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: ; 
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "0r}0`KuNr(ic#{1aOT&");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DocumentContainer.registerXMLParser("7/", (XMLParser) documentContainer0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: 0r}0`KuNr(ic#{1aOT&
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "YvaZK s0U{\"");
      boolean boolean0 = true;
      documentContainer0.setIgnoringElementContentWhitespace(true);
      DocumentContainer.registerXMLParser("", (XMLParser) documentContainer0);
      DocumentContainer.registerXMLParser("?", (XMLParser) documentContainer0);
      DocumentContainer.registerXMLParser("DOM", "");
      DocumentContainer documentContainer1 = new DocumentContainer(uRL0);
      boolean boolean1 = true;
      documentContainer1.setNamespaceAware(true);
      documentContainer1.setIgnoringComments(true);
      // Undeclared exception!
      try { 
        documentContainer0.setValue(documentContainer1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      String string0 = "; ";
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "; ");
      boolean boolean0 = false;
      documentContainer0.setNamespaceAware(true);
      documentContainer0.setNamespaceAware(false);
      DocumentContainer.registerXMLParser("H#", (XMLParser) documentContainer0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      String string0 = "";
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "");
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      String string0 = "Cannot allocate XMLParser: ";
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "Cannot allocate XMLParser: ");
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      pipedInputStream0.close();
      documentContainer0.setCoalescing(false);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: Cannot allocate XMLParser: 
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        MockFile.createTempFile("J", "J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte) (-2);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((PipedOutputStream) null, (byte) (-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "eWqym");
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      documentContainer0.setCoalescing(false);
      DocumentContainer.registerXMLParser("JDOM", "JDOM");
      DocumentContainer.registerXMLParser("DOM", (XMLParser) documentContainer0);
      DocumentContainer.registerXMLParser("DOM", (XMLParser) documentContainer0);
      String string0 = "";
      DocumentContainer.registerXMLParser("", (XMLParser) documentContainer0);
      String string1 = "";
      DocumentContainer.registerXMLParser("m6;vY#y)>Of>_vaMQ3", "");
      DocumentContainer.registerXMLParser("", "DOM");
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "");
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "JDOM parser error";
      JDOMParser jDOMParser0 = new JDOMParser();
      boolean boolean0 = false;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)89;
      byteArray0[3] = (byte)87;
      byteArray0[4] = (byte) (-49);
      byteArray0[5] = (byte)51;
      byteArray0[6] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jDOMParser0.parseXML(pushbackInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jdom/input/SAXBuilder
         //
         verifyException("org.apache.commons.jxpath.xml.JDOMParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.setValue(uRL0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }
}
