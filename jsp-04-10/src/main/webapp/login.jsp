<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Página de Login</title>
</head>
<body>

<div align="center">
    <h1>Pagina de Login</h1>
    <form action="login", method="post">
        <table>
            <tr>
                <td>Nome:</td>
                <td><input type="text" name="username"></td>
            </tr>

            <tr>
                <td>Senha:</td>
                <td><input type="password" name="password"></td>
            </tr>

            <tr>
                <td><input type="submit" value="Entrar"></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>