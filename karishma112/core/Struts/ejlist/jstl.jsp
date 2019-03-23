<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<c:catch var= "e">
  
      actions that might  throw an exception
</c:catch>

<c:out value="${pageContext.out.bufferSize}"/>

<c:out value="${color}" default="red"/>


<c:set var="num" value="${4*4}"/>

<c:set var="num">
${8*2}
</c:set>

<c:set var="num">
   <c:out value="${8+8}"/>
</c:set>


<c:remove var="num" scope="session"/>


<c:set var="num" >

    ${9} 
<c:if test="${x=='9'}">
${x}
</c:if>

</c:set>

<html>
  <body>
    <c:forEach var="x" begin="0" end="30" step="3">
	  ${x}
	  </c:forEach>
	  </body>
	  </html>

	  <html>
	     <body>
		   <c:set var="numList" value="one,two,three,four,five,six"/>
		   Output of the forTokans tag:<p>

		   <table border="1">

	<c:forTokens var="num" items="${numList}" delims=",">
		   <tr><td>${num}</td></tr>
		   </c:forTokens>
		   </table>
        </body>
		</html>
