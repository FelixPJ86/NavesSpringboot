<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>User Information</title>
        <style>
            body{
                 font-family: verdana;
            }
         
            table {
                width: 500px;
                 
            }
             
            table, th, td {
                border: 1px solid black;
                padding: 2px;
            }
             
            .imagen{
            width: 100px;
            height: auto;
            }
             
            th{
                background-color: #00439A;
                color : #FFFFFF;
            }
             
            tr.odd{
                background-color: #CFCFCF;
            }
             
            tr.even{
                background-color: #1076F5;
            }
        </style>
    </head>
    <body>
    <h1>Usuarios aleatorios</h1>
 
    <table>
        <tr>
            <th>id</th>
            <th>nombre</th>
            <th>apellidos</th>
            <th>foto</th>
        </tr> 
        <s:iterator value="tripulantes">
        <tr class="<s:if test="tripulanteId%2==0">even</s:if><s:else>odd</s:else>">
            <td align="center"><s:property value="tripulanteId"/></td>
            <td><s:property value="nombre"/></td>
            <td><s:property value="apellido"/></td>
            <td><img class="imagen" alt="" src="/images/tripulantes/<s:property value="foto"/>"></td>
            
        </tr>
        </s:iterator>
        </table>
    </body>
</html>