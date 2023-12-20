<%@taglib prefix="my" uri="demo.app.tags" %>
<html>
    <head>
        <title>DemoApp</title>
    </head>
    <body>
        <h1>Welcome Gambler</h1>
        <b>WINNER: </b>
        <my:lotto digitVar="d" digitCount="${param.size}">
            <i>${d}</i>
        </my:lotto>
    </body>
</html>
