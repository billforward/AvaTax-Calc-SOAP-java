<body bgcolor="#FFFFFF">
<p>The <strong>AvaTaxCalc JAVA (for SOAP) Sample</strong> is open source designed to assist you with developing your own <em>custom</em> integration to your chosen web store or e-commerce solution. The adapter was built using Apache Axis WSDL2Java to build the stubs which were then enhanced to support a
  custom Profile SOAP header element and a WS-Security UsernameToken SOAP header element.  It uses WSS4J to<br />
  build the security token.</p>
<p>Each sample included can be executed independently from a command prompt provided they have been pre-configured with the Web service <strong>URL</strong> and your <strong>Account</strong> Number and <strong>License</strong> Key.</p>
<p> <em>private static final String</em> <strong>account</strong> = (&quot;<strong>1234567890</strong>&quot;);<br />
  <em>private static final String</em> <strong>url</strong> = &quot;<a href="https://development.avalara.net">https://development.avalara.net</a>&quot;;<br />
  <em>private static final String </em><strong>license</strong> = (&quot;<strong>A1B2C3D4E5F6G7H8</strong>&quot;);<br />
  <em>private static final String</em> <strong>profileName</strong> = (&quot;<strong>AvaTaxSample</strong>&quot;);</p>
<em><strong>Note: </strong></em>The Avalara Admin Account <strong><em>Username</em></strong> and <strong><em>Password</em></strong> can be used in place of <strong><em>Account</em></strong> and <em><strong>License</strong> Key</em>
<p>See <a href="http://developer.avalara.com/api-docs/designing-your-integration/gettax">http://developer.avalara.com/api-docs/designing-your-integration/gettax</a> for more information. </p>
<h4><strong>Installation Dependencies</strong></h4>
<ul>
  <li>All dependent jar files are included in the /lib folder for building and running the included samples.</li>
  <li>You must have JDK 5.0 or later </li>
  <li> avatax4j.wsdd - Axis deployment descriptor (required for WSS4J)</li>
  <li> Sample is compatible with J2SDK 1.4.2  however we are no longer able to provide support for this version. </li>
  <li> You will need to use the cacert file from JDK 5.0. <a href="http://www.oracle.com/technetwork/java/javasebusiness/downloads/">http://www.oracle.com/technetwork/java/javasebusiness/downloads/</a></li>
  <li> Apache Ant 1.6.x or later   http://ant.apache.org/bindownload.cgi</li>
</ul>
<h4><strong>Known Issues</strong></h4>
<p>1.  If you get a warning message regarding Xalan as follows:<br />
</p>
<pre>    Unable to patch xalan function table.<br />
    java.lang.NoSuchFieldException: m_functions<br />
    at java.lang.Class.getField(Unknown Source)<br />
    at org.apache.xml.security.Init.registerHereFunction(Init.java:429)<br />
    at org.apache.xml.security.Init.init(Init.java:124)&hellip; (and so on)</pre>
<p> You will need to copy the xalan-2.6.0.jar to your JAVA_HOME/lib/endorsed/ directory.  You may need to create the endorsed directory.<br />
</p>
<h4><strong>Samples Included</strong></h4>
<table width="1000" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="172"><div align="center"><strong>API</strong></div></td>
    <td width="828"><div align="center"><strong>Method Demonstrated</strong></div></td>
  </tr>
  <tr>
    <td><strong>IsAuthorizedTest.java</strong></td>
    <td> IsAuthorized is a method that allows the user to specify a number of a methods or services to ascertain  if they are permitted to use them based on the credentials  provided in the request.</td>
  </tr>
  <tr>
    <td><strong>PingTest.java</strong></td>
    <td> The Ping method can be used for testing connectivity to the AvaTax web service, verify  supplied credentials, and return the service version in use by the AvaTax web service. </td>
  </tr>
  <tr>
    <td><strong>ValidateTest.java</strong></td>
    <td>Validate demonstrates the <a href="http://developer.avalara.com/api-docs/avalara-avatax-api-reference#cat-Validate" target="_blank">ValidateAddress</a> method that <a href="http://developer.avalara.com/api-docs/api-reference/address-validation">normalizes a provided address</a>. US and Canada only.</td>
  </tr>
  <tr>
    <td><strong>GetTaxRequestTest.java </strong></td>
    <td>The <a href="http://developer.avalara.com/api-docs/avalara-avatax-api-reference#cat-GetTax" target="_blank">GetTaxRequest</a> method calculates retail sales tax on documents such as sales orders, sales invoices, purchase orders, purchase invoices, or credit memos.<strong> Note:</strong> A document can be committed at this stage by setting the <em>Commit</em> property to <em>true</em> (default is <em>false</em>).</td>
  </tr>
  <tr>
    <td><strong>PostTaxTest.java</strong></td>
    <td> The <a href="http://developer.avalara.com/api-docs/avalara-avatax-api-reference#cat-PostTax">PostTax</a> method can be used to modify the state of a SalesInvoice, ReturnInvoice or PurchaseInvoice document saved to the AvaTax database. <strong>Note:</strong> A document can be committed at this stage by setting the Commit property to true (default is false).</td>
  </tr>
  <tr>
    <td><strong>CommitTaxTest.java</strong></td>
    <td>The CommitTax method  can be used to modify the state of a document that is &quot;<em>posted</em>&quot; (only) to the AvaTax database via SalesInvoice, ReturnInvoice or PurchaseInvoice a methods. <strong>Note:</strong> CommitTax is not a required step to commit a document to AvaTax. Documents can  be committed during the GetTax or PostTax document lifecycle. </td>
  </tr>
  <tr>
    <td><strong>GetTaxHistoryTest.java</strong></td>
    <td><a href="http://developer.avalara.com/api-docs/avalara-avatax-api-reference#cat-GetTaxHistory" target="_blank">GetTaxHistory</a> is a method that retrieves  details from a previously saved (to the AvaTax database) documents.</td>
  </tr>
  <tr>
    <td><strong>AdjustTaxTest.java</strong></td>
    <td>AdjustTax is a method that has the ability to modify elements of an <em>already committed document</em>. <strong>Note:</strong> Sets the <em>Document Modified</em> flag.</td>
  </tr>
  <tr>
    <td><strong>CancelTaxTest.java</strong></td>
    <td><a href="http://developer.avalara.com/api-docs/avalara-avatax-api-reference#cat-CancelTax">CancelTax</a> is a method that cancels a tax document specified by the DocId, DocCode, and DocType parameters. See&nbsp;<a href="http://developer.avalara.com/api-docs/avalara-avatax-api-reference#cat-CancelTax" target="_blank">CancelTax</a>&nbsp;for more details.</td>
  </tr>
  <tr>
    <td><strong>ReconcileTaxHistoryTest.java</strong></td>
    <td>ReconcileTaxHistory is a method that  will produce a listing of documents saved to the AvaTax database -based on a range of dates or document codes.</td>
  </tr>
  <tr>
    <td>/lib</td>
    <td>Contains the required jar files</td>
  </tr>
  <tr>
    <td>/doc</td>
    <td>Contains documentation for the sorce code located in <strong>/src </strong>-- Navigate to ..<a href="\doc\api\index.html">\doc\api\index.html</a> to veiw documentation.</td>
  </tr>
  <tr>
    <td><strong>/src</strong></td>
    <td>Contains the core classes that enable the API samples to make AvaTax web service calls.</td>
  </tr>
  <tr>
    <td colspan="2"><h4><strong>Other Files Included in this Repository</strong></h4></td>
  </tr>
  <tr>
    <td><strong><em>.gitattributes</em></strong></td>
    <td><em>GitHub attribute file. Not required for sample use.</em></td>
  </tr>
  <tr>
    <td><strong><em>.gitignore</em></strong></td>
    <td><em>GitHub config file. Not required for sample use.</em></td>
  </tr>
  <tr>
    <td><strong>LICENSE.md</strong></td>
    <td>Apache License TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION</td>
  </tr>
  <tr>
    <td><strong>README.md</strong></td>
    <td>This document describing how to make use of the sample API code.</td>
  </tr>
</table>
<h4><strong>Resources</strong><br />
</h4>
<p>Developer API Documentation is located here: <a href="http://developer.avalara.com/api-docs" target="_blank">http://developer.avalara.com/api-docs</a></p>
<p>The Avalara AvaTax API Reference is located here: <a href="http://developer.avalara.com/api-docs/avalara-avatax-api-reference" target="_blank">http://developer.avalara.com/api-docs/avalara-avatax-api-reference</a></p>
<p>Find out what other developers are talking about on the <em>Avalara Developer Community Forum</em> located here: <a href="https://community.avalara.com/avalara/category_sets/developers" target="_blank">https://community.avalara.com/avalara/category_sets/developers</a></p>
<p>Frequently asked questions regarding the Avalara product is located here: <a href="https://help.avalara.com/" target="_blank">https://help.avalara.com/</a></p>
