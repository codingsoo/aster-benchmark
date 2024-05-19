
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.XMLParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DocumentContainer_ESTest extends DocumentContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
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
  public void test01()  throws Throwable  {
      String string0 = "";
      URL uRL0 = null;
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
  public void test02()  throws Throwable  {
      URL uRL0 = null;
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null, "9gJpfpvz-E*^g4'mM");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DocumentContainer.registerXMLParser("=()y>NH>", "");
      DocumentContainer.registerXMLParser("", "=()y>NH>");
      DocumentContainer.registerXMLParser("D", (XMLParser) null);
      DocumentContainer.registerXMLParser("=CdrCMd@P", (XMLParser) null);
      DocumentContainer.registerXMLParser("=()y>NH>", "");
      DocumentContainer.registerXMLParser("7PVOz", (XMLParser) null);
      // Undeclared exception!
      try { 
        MockURL.URL((String) null, "org.apache.commons.jxpath.xml.DOMParser", 0, "org.apache.commons.jxpath.xml.XMLParser2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      String string0 = "; ";
      URL uRL1 = MockURL.URL(uRL0, "; ");
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL2 = MockURL.URL(uRL1, "; ", uRLStreamHandler0);
      DocumentContainer documentContainer0 = new DocumentContainer(uRL2, "; ");
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
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      DocumentContainer.registerXMLParser("", (XMLParser) documentContainer0);
      DocumentContainer documentContainer1 = new DocumentContainer(uRL0);
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
  public void test06()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URL uRL0 = MockURI.toURL(uRI0);
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
  public void test07()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URL uRL0 = MockURI.toURL(uRI0);
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://foo.bar; Could not find: foo.bar
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "";
      DocumentContainer.registerXMLParser("", "");
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      DocumentContainer.registerXMLParser("JDOM", (XMLParser) documentContainer0);
      boolean boolean0 = true;
      documentContainer0.setIgnoringElementContentWhitespace(true);
      documentContainer0.setValidating(false);
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
  public void test09()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("DOM", "DOM", 0, "DOM", uRLStreamHandler0);
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      InputStream inputStream0 = null;
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(inputStream0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot allocate XMLParser: ; 
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        MockURL.URL((String) null, (String) null, 1398, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "", uRLStreamHandler0);
      DocumentContainer documentContainer0 = new DocumentContainer(uRL1);
      DocumentContainer.registerXMLParser("", (XMLParser) documentContainer0);
      assertTrue(documentContainer0.isNamespaceAware());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      String string0 = "bo0uUAaT";
      String string1 = "";
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("Ri{GYclA?K+", "bo0uUAaT", (-1), "", uRLStreamHandler0);
      try { 
        MockURL.URL(uRL0, "");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: ri{gycla?k+
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      DocumentContainer.registerXMLParser("5", (XMLParser) documentContainer0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(mockFileInputStream0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot allocate XMLParser: ; 
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }
}
