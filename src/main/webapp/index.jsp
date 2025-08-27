<%
  response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); 
  response.setHeader("Pragma","no-cache"); 
  response.setDateHeader("Expires", -1);
  response.setContentType("text/html");
%>

<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- please do NOT remove next 3 lines related to caching, removal of those lines might create problems on DEV instances (when content is not delivered over https) -->
  <meta http-equiv="Cache-Control"   content="no-cache, no-store, must-revalidate" />
  <meta http-equiv="Pragma"          content="no-cache" />
  <meta http-equiv="Expires"         content="0" />
  <meta http-equiv="content-type"    content="text/html; charset=UTF-8">
  <meta http-equiv="imagetoolbar"    content="no">
  <link rel="shortcut icon"   href="favicon.ico">
  <title>MERGED MODEL</title>
  <script  src="./buildVersion999/js/vcaps3.js"></script>
  <script  src="./buildVersion999/js/header/header.common.js"></script>
</head>

<a href="jsf/boardMatrixEdit.jsf">boardMatrixEdit</a>
</html>
