<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%if ("POST".equalsIgnoreCase(request.getMethod())) {
    
} else {
    
}
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cache implementation</title>

    </head>
    <body>
        <form action="static.jsp" >
        <h1>Select on option :</h1>
        <select name="cache" >
            <option value="1">Static cache</option>
            <option value="2">Dynamic cache</option>
            <option value="3">FIFO cache</option>
            <option value="4">LRU cache</option>
           <input type="submit" name="submit" value="submit"/>
            
        </select>
        
        </form>


    </body>
</html>

