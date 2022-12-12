<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../css/styles.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>3 pregunta</title>
</head>
<body>
    <a href="../index.jsp"> volver</a>
    <div class="form-register">
        <form action="../vistas/pregunta4.jsp" method="post">
            <h2>3.El nombre que tenia el actual territorio colombiano antes de la independencia era:</h2>
            <img  src="../imagenes/pregunta3.jpeg" alt="croquis"><br>
        <label >
            <input type="radio" value="1" name="p1">Virreinato de nueva españa
        </label><br>
        <label >
            <input type="radio" value="2" name="p1">Virreinato del rio de la plata
        </label><br>
        <label >
            <input type="radio" value="3" name="p1">Virreinato de la nueva granada
        </label><br>
        <input type="submit" id="Siguiente" class="botons" value="Siguiente" ></input>
        
        </form>     
</div>
    
</body>
</html>